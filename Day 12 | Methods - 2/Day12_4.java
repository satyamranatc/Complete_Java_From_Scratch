/*
 
In Java, the "..." operator is called the varargs (variable-length argument) feature. It allows a method to accept a variable number of arguments of the same type. The varargs feature simplifies the declaration and invocation of methods that need to take a variable number of parameters.
 */

public class Day12_4 
{
    //! This ... Will Accpet all the elements as array
    static void add(int ...nums) 
    {
        int sum = 0;
        for(int i : nums)
        {
            sum+= i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        add(3,4);
        add(3,43,2);
        add(3,4,4,5,5);

    }
    
}
