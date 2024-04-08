
import java.util.Scanner;
class Employee
{
    String Name;
    int Id;

    Employee(String Name, int Id)
    {
        this.Name = Name;
        this.Id = Id;

    }

    void UpdateData(String Name, int Id)
    {
        this.Name = Name;
        this.Id = Id;

    }

    void GetData()
    {
        System.out.println("Name: " + Name);
        System.out.println("Id: " + Id);
        System.out.println("-----------------------");
    }
}

public class Day14_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int TotalCapacity = 2;
        Employee Employees[] = new Employee[TotalCapacity];

        int Choice;
        int Index = -1;

        while (1 == 1) 
        {
            System.out.println("Press:\n1 For Add\n2 For Disable\n3 For Update\n4 For Exit: ");
            Choice = sc.nextInt();

            if (Choice == 1) 
            {
                if (Index+1 < TotalCapacity) 
                {

                    int Id;
                    String Name;


                    System.out.println("Enter Id: ");
                    Id = sc.nextInt();

                    boolean DuplicateIdFound = false;
                    for(int i = 0; i <=Index; i++)
                    {
                        if(Employees[i].Id == Id)
                        {
                            DuplicateIdFound = true;
                            System.out.println("\n*****************************");
                            System.out.println("Employee Already Exists");
                            System.out.println("*****************************");
                            break;
                        }
                             
                    }

                    if (!DuplicateIdFound) 
                    {
                        System.out.println("Enter Name: ");
                        Name = sc.next();
                        Index++;
                        Employees[Index] = new Employee(Name, Id);  
                    }
                     
                }
                else
                {
                    System.out.println("\n*****************************");
                    System.out.println("No More Spase Available");
                    System.out.println("*****************************");
                }
            }
            else if (Choice == 2)
            {
                System.out.println("\n*****************************");
                for(int i = 0; i <=Index; i++)
                {
                    Employees[i].GetData();
                }
                System.out.println("*****************************");
                
            }
            
            else if (Choice == 3)
            {
                
                
                System.out.println("\n*****************************");
                System.out.println("Enter Id: ");
                int Id = sc.nextInt();

                int IdFoundOn = -1;

                for(int i = 0; i <=Index; i++)
                {
                    if(Employees[i].Id == Id)
                    {
                        IdFoundOn = i;
                        break;
                    }
                }
                if(IdFoundOn != -1)
                {

                    sc.nextLine(); //! For Handling the NewLine character 
                    System.out.println("Enter The New Name You Want To Update: ");
                    String N = sc.nextLine();
                    System.out.println(N);
                    Employees[IdFoundOn].UpdateData(N, Id);
                    System.out.println("*****************************");
                    
                }
                else
                {
                    System.out.println("\n*****************************");
                    System.out.println("Employee Not Found");
                    System.out.println("*****************************");
                }
               
            }

            else if (Choice == 4)
            {
                System.out.println("\n*****************************");
                System.out.println("Thanks For Using...");
                System.out.println("*****************************");
                break;
            }
            else
            {
                System.out.println("Invalid Choice");
            }
            
        }

        
    }
    
}
