import java.util.Random;
import java.util.Scanner;

class Bank
{
    static String Bank_name = "My Bank Of Java";

    String Name;
    int Age;
    long Ac_No;

    Bank(String name,int age)
    {
        this.Name = name;
        this.Age = age;
        Random random = new Random();
        this.Ac_No = random.nextInt(100000);
    }
    void display()
    {
        System.out.println("Welcome to " + Bank_name);
        System.out.println("Name : "+Name);
        System.out.println("Age : "+Age);
        System.out.println("Account Number : "+Ac_No);
        System.out.println("---------------------");
    }

}
class Main
{
    public static void main(String[] args) {
        
       Bank AllAccounts[] = new Bank[100];
       int CurrentIndex = -1;

       Scanner Sc = new Scanner(System.in);

       while(true)
       {
        System.out.println("1. Create Account");
        System.out.println("2. Display Account");
        System.out.println("3. Exit");
        int Choice = Sc.nextInt();

        if(Choice == 1)
        {
            System.out.println("Enter Name : ");
            String Name = Sc.next();
            System.out.println("Enter Age : ");
            int Age = Sc.nextInt();


            AllAccounts[++CurrentIndex] = new Bank(Name,Age);
            AllAccounts[CurrentIndex].display();
        }
        else if(Choice == 2)
        {
            System.out.println("****************************************************************");
            if(CurrentIndex == -1)
            {
                System.out.println("No Accounts Created");
            }
            else
            {
                // Take Inpt For Ac Number:
                System.out.println("Enter Account Number : ");
                long Ac_No = Sc.nextLong();

                int AcIndex = -1;
                for(int i=0;i<=CurrentIndex;i++)
                {
                    System.out.println(AllAccounts[i].Ac_No);
                    if(AllAccounts[i].Ac_No == Ac_No)
                    {
                        AcIndex = i;
                        System.out.println(i);
                        break;
                    }
                }
                if(AcIndex == -1)
                {
                    System.out.println("Account Not Found");
                }
                else{
                    AllAccounts[AcIndex].display();
                }
            }
            System.out.println("****************************************************************");
        }


       }



    }
}
