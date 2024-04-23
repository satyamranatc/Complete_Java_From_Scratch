import java.util.Scanner;

class Car
{
    static int Wheel = 4;
    static int Door = 4;

    int Seat = 4;
    String Model;
    String Color;
    int Mil;

    Car()
    {
        Model = "";
        Color = "";
        Mil = 0;
    }

    Car(String Model, String Color, int Mil, int Seat)
    {
        this.Model = Model;
        this.Color = Color;
        this.Mil = Mil;
        this.Seat = Seat;
    }
    void Show()
    {
        System.out.println("Model : " + Model);
        System.out.println("Color : " + Color);
        System.out.println("Mil : " + Mil);
        System.out.println("Seat : " + Seat);
        System.out.println("Wheel : " + Wheel);
        System.out.println("Door : " + Door);
        System.out.println("---------------------");
    }

    static void Run()
    {
        System.out.println("Runing");
    }

}

class Demo
{



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int Capasity = 100;
        Car [] Cars = new Car[Capasity];

        int CarIndex = -1;

        while (true) 
        {

            System.out.println("Press:\n1. For Add\n2. For Show\n3. For Exit\n");
            int ch = sc.nextInt();

            if(ch == 1)
            {
                System.out.println("********************************");
                if(CarIndex < Capasity)
                {   
                    System.out.println("Model : ");
                    String Model = sc.next();
                    System.out.println("Color : ");
                    String Color = sc.next();
                    System.out.println("Mil : ");
                    int Mil = sc.nextInt();
                    System.out.println("Seat : ");
                    int Seat = sc.nextInt();


                    CarIndex++;
                    Cars[CarIndex]= new Car(Model,Color,Mil,Seat);
                }
                else
                {
                    System.out.println("Car array is Full");
                }
                System.out.println("********************************");
            }
            else if(ch == 2)
            {
                System.out.println("**********************************");
                for(int i = 0; i <= CarIndex; i++)
                {
                    Cars[i].Show();
                }
                System.out.println("**********************************");
            }
            
            else if(ch == 3)
            {
                System.out.println("**********************************");
                System.out.println("-----------Thank You-----------");
                System.out.println("**********************************");
                break;
            }
            else
            {
                System.out.println("**********************************");
                System.out.println("-----------Wrong Input-----------");
                System.out.println("**********************************");

            }

            
        }




    }
}
