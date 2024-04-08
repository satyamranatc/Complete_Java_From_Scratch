class Day12_5 
{

    static void Fun(int a)
    {
        System.out.println(a);
        
        if(a == 0)
        {
            return;
        }
        
        a--;
        Fun(a);
    }




    public static void main(String[] args)
     {

        Fun(5);

        /*
            Fun(5)
              |
              └── Fun(4)
                    |
                    └── Fun(3)
                          |
                          └── Fun(2)
                                |
                                └── Fun(1)
                                      |
                                      └── Fun(0)
 */



    }

    
}
