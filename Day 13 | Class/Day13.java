class Person
{
    int id;
    String name;


    void setData(int i, String n)
    {
        id = i;
        name = n;
    }

    void getData()
    {
        System.out.println("Hi");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("------------------");
    } 

}

class Day13
{
    public static void main(String[] args) 
    {

        Person P = new Person();
        P.setData(123,"Hitesh");
        P.getData();


        Person P2 = new Person();
        P2.setData(124,"Harsh");
        P2.getData();


    }
}