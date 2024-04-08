// ! Constructor:- 
// ?   A Function Which is Called Whenever a Object 
// ?   is Created or It Can Not Retun anything...
class Person
{
    int id;
    String name;

    //! Default Constructor
    Person()
    {
        id = 0;
        name = "Jhon Doe";
    }

    //! Constructor Overloading
    Person(int i, String n)
    {
        id = i;
        name = n;
    }
    //! Constructor Overloading (Copy Constructor)
    Person(Person P)
    {
        this.id  = P.id;
        this.name = P.name;
    }



    void getData()
    {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("------------------");
    } 

}

class Day14
{
    public static void main(String[] args) 
    {

        Person P1 = new Person();//? Default Constructor
        P1.getData();
        
        
        Person P2 = new Person(124,"Harsh");
        P2.getData();

        Person P3 = new Person(123,"Hitesh");
        P3.getData();


        Person P4 = new Person(P3);//? Calling Copy Constructor
        P4.getData();


    }
}