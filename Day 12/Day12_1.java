class Day12_1
{

    static int add(int a, int b) 
    //! Insted Of Void We Will They Type Of Data We Want To Return
    {
        int Result = a + b;
        return Result; //? The Value Of Result Will be Returned
    }

    public static void main(String[] args) 
    {
    
        int Result = add(3,6); //? This is a new variable 
        System.out.println(Result);

    }
    
}
