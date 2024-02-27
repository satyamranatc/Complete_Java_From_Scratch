class Day5 
{

    public static void main(String[] args) {

        //! Break It Will Stop The Loop From Further Iteration
        // for(int  i = 5; i <= 15; i++)
        // {
        //     if(i == 9)
        //     {
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Hi");
        
    // ! Continue:- This will Skip That Particular Iteration
        // for(int  i = 5; i <= 15; i++)
        // {
        //     if(i == 9 || i == 12 || i == 13)
        //     {
        //         continue;
        //     }
        //     System.out.println(i);
        // }
        // System.out.println("Hi");

        // ! Playing With The Syntax:
        // for(int i = 0;;)
        // {
        //     if(i > 30)
        //     {
        //         break;
        //     }
        //     System.out.println(i);
        //     i++;
        // }

        //? Practices:
        //* Problem 1:
            //  Check a Number is Prime or Composite

        int num = 45;

        
        int flag = 1;
        for(int i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println(num + " is Prime");
        }
        else
        {
            System.out.println(num + " is Composite");
        }



    }
    
}
