import java.util.Random;
import java.util.Scanner;

class Bank {
    static String Bank_name = "My Bank Of Java";

    String Name;
    int Age;
    long Ac_No;

    Bank(String name, int age) {
        this.Name = name;
        this.Age = age;
        Random random = new Random();
        this.Ac_No = random.nextInt(100000);
    }

    void display() {
        System.out.println("Welcome to " + Bank_name);
        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Account Number : " + Ac_No);
        System.out.println("---------------------");
    }

}

class SavingAccount extends Bank {
    int Ballance;
    int Deposit;
    int Withdraw;
    SavingAccount(String name, int age, int Ballance)
    {
        super(name, age);
        this.Ballance = Ballance;

    }

    void display() {
        System.out.println("Welcome to " + Bank_name);
        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Account Number : " + Ac_No);
        System.out.println("Account Ballance : " + Ballance);
        System.out.println("---------------------");
    }

    void Deposit(int amount)
    {
        Ballance += amount;
        System.out.println("Your Ballance is : " + Ballance);
        System.out.println("---------------------");
    }
    void Withdraw(int amount)
    {
        Ballance -= amount;
        System.out.println("Your Ballance is : " + Ballance);
        System.out.println("---------------------");
    }

}
class CurrentAccount extends Bank {
    int Ballance;
    int Deposit;
    int Withdraw;
    CurrentAccount(String name, int age, int Ballance)
    {
        super(name, age);
        this.Ballance = Ballance;

    }

    void display() {
        System.out.println("Welcome to " + Bank_name);
        System.out.println("Name : " + Name);
        System.out.println("Age : " + Age);
        System.out.println("Account Number : " + Ac_No);
        System.out.println("Account Ballance : " + Ballance);
        System.out.println("---------------------");
    }


    void Deposit(int amount)
    {
        Ballance += amount;
        System.out.println("Your Ballance is : " + Ballance);
        System.out.println("---------------------");
    }
    public void Withdraw(int amount)
    {
        Ballance -= amount;
        System.out.println("Your Ballance is : " + Ballance);
        System.out.println("---------------------");
    }

}

class Main {
    public static void main(String[] args) {

        Bank AllAccounts[] = new Bank[100];
        int CurrentIndex = -1;

        Scanner Sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Account");
            System.out.println("2. Display Account");
            System.out.println("3. Withdraw Amount");
            System.out.println("4. Deposite Amount");
            System.out.println("5. Exit");
            int Choice = Sc.nextInt();

            if (Choice == 1) {
                System.out.println("Enter Name : ");
                String Name = Sc.next();
                System.out.println("Enter Age : ");
                int Age = Sc.nextInt();
                System.out.println("Press\n1 For Savings\n2 For Current : ");
                int Type = Sc.nextInt();

                switch (Type) {
                    case 1:
                        System.out.println("Enter Ballance : ");
                        int Ballance = Sc.nextInt();
                        CurrentIndex++;
                        AllAccounts[CurrentIndex] = new SavingAccount(Name, Age, Ballance);
                        AllAccounts[CurrentIndex].display();
                        break;
                        case 2:
                        System.out.println("Enter Ballance : ");
                        int Ballance1 = Sc.nextInt();
                        CurrentIndex++;
                        AllAccounts[CurrentIndex] = new CurrentAccount(Name, Age, Ballance1);
                        AllAccounts[CurrentIndex].display();
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }


            } 
            
            
            
            else if (Choice == 2) {
                System.out.println("****************************************************************");
                if (CurrentIndex == -1) {
                    System.out.println("No Accounts Created");
                } else {
                    // Take Inpt For Ac Number:
                    System.out.println("Enter Account Number : ");
                    long Ac_No = Sc.nextLong();

                    int AcIndex = -1;
                    for (int i = 0; i <= CurrentIndex; i++) {
                        System.out.println(AllAccounts[i].Ac_No);
                        if (AllAccounts[i].Ac_No == Ac_No) {
                            AcIndex = i;
                            System.out.println(i);
                            break;
                        }
                    }
                    if (AcIndex == -1) {
                        System.out.println("Account Not Found");
                    } else {
                        AllAccounts[AcIndex].display();
                    }
                }
                System.out.println("****************************************************************");
            }

            else if (Choice == 3) {
                System.out.println("****************************************************************");
                System.out.println("Enter Your Account Number:");
                    long Ac_No = Sc.nextLong();

                    int AcIndex = -1;
                    for (int i = 0; i <= CurrentIndex; i++) {
                        if (AllAccounts[i].Ac_No == Ac_No) {
                            AcIndex = i;
                            break;
                        }
                    }
                    if (AcIndex == -1) {
                        System.out.println("Account Not Found");
                    } else {
                        System.out.println("Enter Amount : ");
                        int amount = Sc.nextInt();
                        ((SavingAccount) AllAccounts[AcIndex]).Withdraw(amount);
                    }


            }


            else if (Choice == 4) {
                System.out.println("****************************************************************");
                System.out.println("Enter Your Account Number:");
                    long Ac_No = Sc.nextLong();

                    int AcIndex = -1;
                    for (int i = 0; i <= CurrentIndex; i++) {
                        if (AllAccounts[i].Ac_No == Ac_No) {
                            AcIndex = i;
                            break;
                        }
                    }
                    if (AcIndex == -1) {
                        System.out.println("Account Not Found");
                    } else {
                        System.out.println("Enter Amount : ");
                        int amount = Sc.nextInt();
                        ((SavingAccount) AllAccounts[AcIndex]).Deposit(amount);
                    }


            }

        }

    }
}
