public class Day8 
{
    public static void main(String[] args) 
    {

    // //! Array Is A Collection Of Similar Data..
    // //?  We Can Create a Array In Java By Two Methods:
    
    // //! 1. Array By Litral:
//        int arr[] = {10,20,30,40,50,60,70,80,90};
//        int []arr2 = {10,20,30,40,50,60,70,80,90};
//        char Sections[] = {'a', 'b', 'c', 'd', 'e'};
//        float Marks[]  = {89.4f,45.6f,99.5f,99.5f,99.5f,99.5f};
//        String Names[] = {"Jaya","Mohan","Nitin","Aman"}; 

//         // Printing The Array:
//         System.out.println(arr[0]);
//         //? 0  is the first element(Index)

//         // Printing All Elements:
//         //! 1.For Loop
//         //* arr.length is the number of elements in the array..
//         for(int i=0; i<arr.length; i++)
//         {
//             System.out.println(arr[i]);
//         }

//          //! 2.For Each Loop
//         //* I will print the elements directly without index
//         for(int i : arr)
//         {
//             System.out.println(i);
//         }


    //! Some Practise Problems?

    //? 1. How To Find The Index Of An Element?
    // int arr[] = {10,20,30,40,50,60,70,80,90};

    // int Search = 40;

    // for(int i=0; i<arr.length; i++)
    // {
    //     if (arr[i] == Search) 
    //     {
    //         System.out.println("Element Found On Index- " + i);
    //     }
    // }

    //? 2. Find A element Count in the array...

    int arr[] = {10,20,10,40,20,10,10,0,20};

    int Search = 10;

    int Count = 0;
    for(int i : arr)
    {
        if (i == Search) 
        {
           Count++;
        }
    }

    System.out.println("The "+ Search+" Is Present "+ Count + " Times In Array");




    }
}
