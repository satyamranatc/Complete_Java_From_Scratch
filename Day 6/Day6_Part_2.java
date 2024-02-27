class Day6_Part_2{
    public static void main(String[] args) {
        
        //! Do While Loop:
        //* Do While Loop Executes 1 time weather the even Condition is false.

        int x = -10;
        do
        {
            System.out.println(x);
            x--;    
        }
        while (x > 0);


        //!------ Intro For Nested Loops-------
        //* Repeating The Loop It Self
 
        for(int a = 0; a < 10; a++)
        {
            for(int i = 0; i < 5; i++)
            {
                System.out.print("Hello ");
            }
            System.out.println("\n----------------------");
        
        }


    }
}