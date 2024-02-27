// ! Passing Functions as arguments....

class Day12_2 {

    static void Fun() 
    {
        System.out.println("Hello By Fun!");
    }

    static void X(Runnable a) 
    {
        System.out.println("Hello By X!");
        a.run();
        
    }

    public static void main(String[] args) 
    {
        X(Day12_2::Fun);
        X(Day12_2::Fun);
    }
}
