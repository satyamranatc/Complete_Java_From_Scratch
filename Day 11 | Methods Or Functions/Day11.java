class Day11
{

    /*
    ! Functions are Basically a Part of code which you can call/use
      ! When needed...

    ?Types Of Functions:
        * 1. No Argument No Return (Simple Function)
        * 2. With Argument No Return (Add, Sub, Sqr ,etc...)
        * 3. With Argument With Return...
        * 4. No Argument With Return...




    */ 
    //! Type 1
    //! This is The Simplest Function/Method Which Will Print These 3 Lines...
    // static void greet()
    // {
    //     System.out.println("Hello");
    //     System.out.println("Good Morning");
    //     System.out.println("--------------");
    // }

    //! Type 2
    // ?! Functions With Arguments
    //?1. Add Function
    static void Add(int a, int b)//? a,b are the arguments
    {
        System.out.println(a + " + " + b + "  = " + (a+b));
    }

    //?2. Square Function
    static void Sqr(int a)//? a is the argument
    {
        System.out.println(a + " * " + a + "  = " + (a*a));
    }

    //?3. Div Function
    static void Div(int a, int b)//? a,b are the arguments
    {
        int Result = a/b;
        System.out.println(a + " / " + b + "  = " + Result);
        Sqr(Result); //? Div is Calling To Sqr Function
    }





    //?4. Check Function For Checking Even/Odd
    static void Check(int num)//? num is the argument
    {
        if(num % 2 == 0)
        {
            System.out.println(num + " is Even");
        }
        else
        {
            System.out.println(num + " is Odd");
        }

    }


    public static void main(String[] args) 
    {
        
        //!1. Simple Function
        
        // System.out.println("Shubhangi");
        // greet();

        // System.out.println("Rishabh");
        // greet();
     
        // System.out.println("Rohit");
        // greet();



        // !------------------------------
        //!2. Function With Multiple Arguments
        // Add(1,2); //? Passing 1,2 as Parameters
        // Add(3,5);
        // Add(5,6);
        // Add(7,9);
    
        // //? More Examples:

        // System.out.println("--------------");
        
        // Sqr(5);
        
        // System.out.println("--------------");

        // Check(45);
        // Check(76);
        // Check(15);


    //!------------------------------------------------------
        // ? Function Calling To a Function
        Div(71,4); //? Div Function Will Call The Sqr Function Internally...

    //! ----------------------------------------------------------------

        // ? Function Lifecycle:
            // !    ____Java_____
            // ?   |             |
            // ?   v             |
            // ! - Main Function | 
            // ?   |             |  <----- Program starts here
            // ?   v             |
            // * - Other Func.   |
            // ?   |             |
            // ?   v             |
            // ! - Back to Main  |
            // ?   |             |  <----- Program continues after other functions
            // ?   v             |
            // !  _____End______ |

//!----------------------------------------------------
            // ? -----------Return------------

        //* Rough Code Just For Explanations */
        /*

            staic void Fun()
            {
                int a = 5; --> Is a Local Variable, 
                            We can Not Access this Variable
                            Outside the Function

                ! If we Want to access a Local Variable
                ! We Have To Use 
                ?       Return


            }

            ? Syntax For Return Function:

           static void Fun()
            {
            ?    int a = 10;

            !   return a;

                ? (return a) means throw the value of a from where the function id called...

            }

           !sout(a); --> We can not access a Local Variable even after returning it 

           we have to accept that returning data:

           ? int x = fun(); --> x will store the value of return
    


         
         */




    }
}
