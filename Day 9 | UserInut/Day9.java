import java.util.Scanner;

class Day9 
{

    public static void main(String[] args) {

        //! User Input:

        //  You can Igonore This Line as a Beginner
        // Scanner sc = new Scanner(System.in);

        // int a;
        // //? Next int Is Used for Accepting The Integer Data From Terminal
        // a = sc.nextInt();
        // System.out.println(a*a);

// !----------------------------------------------------------------
// For User Input We Have To Write This Line:
    Scanner sc = new Scanner(System.in);

  //! The Second Method For Creating a Array.

    // 2. Array By New Keyword
    int arr[]; //? Declaring The array
    arr = new int[10]; //? Initializing The Array
    for(int i = 0; i < 10; i++)
    {
        arr[i] = sc.nextInt();
    }
    System.out.println("--------------------------------");

    
    for(int i : arr)
    {
        System.out.println("The Num Is "+ (i*i));
    }
        










    }


}
