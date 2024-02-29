import java.time.Period;
import java.util.Scanner;

class Car
{
    String Model;
    int Speed;

    Scanner sc = new Scanner(System.in);

    Car(String Model, int Speed)
    {
        System.out.println("Enter Model: " );
        this.Model = sc.nextLine();
        System.out.println("Enter Speed: " );
        this.Speed = sc.nextInt();
    }

    void GetData()
    {
        System.out.println("Model: " + Model);
        System.out.println("Speed: " + Speed);
        System.out.println("-----------------------");
    }
}

public class Day14_2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int TotalCapacity = 2;
        Car cars[] = new Car[TotalCapacity];

        int Choice;
        int Index = -1;

        while (1 == 1) 
        {
            System.out.println("Press:\n1 For Add\n2 For Disable\n3 For Exit: ");
            Choice = sc.nextInt();

            if (Choice == 1) 
            {
                if (Index+1 < TotalCapacity) 
                {
                    Index++;
                    cars[Index] = new Car("Ford",123);    
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
                    cars[i].GetData();
                }
                System.out.println("*****************************");
                
            }
            else if (Choice == 3)
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
