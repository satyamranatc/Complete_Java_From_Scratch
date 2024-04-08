// ! ..............Basic Overloading............

public class Day12_3 
{
    static void Add(int a, int b)
    {
        System.out.println(a + " + " + b + "  = " + (a+b));
    }

    // ! Here We Are Overloading That Add Fuction/Method
    static void Add(int a, int b, int c)
    {
        System.out.println(a + " + " + b +" + " + c +" = " + (a+b+c));
    }

    public static void main(String[] args) 
    {
        Add(3, 22);
        Add(3, 22,44);
    }

}
