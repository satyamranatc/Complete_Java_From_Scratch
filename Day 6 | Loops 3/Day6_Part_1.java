class Day_Part_1 {

    public static void main(String[] args) {

        // !While Loop:

        // int x = 1;
        // while (x <= 10) 
        // {
        //     System.out.println(x);
        //     x++;
        // }

        // ! Reversed:
        // int x = 10;
        // while (x >= 1) 
        // {
        //     System.out.println(x);
        //     x--;
        // }

        //! Practice Problem:
        // ? Find How Many Digits Are There In a Number.

        // int num = 189; 
        /*      
        Logic Behind This, If We Divise The Number By 10
        num = 189:
        189 / 10 = 18 in 1 Division | Remainder - 9
        18  / 10 = 1  in 2 Division | Remainder - 8
        1   / 10 = 0  in 3 Division | Remainder - 1
        */
        
        // int count = 0; //? For Storing The Count of Digits.
        // while (num >0)
        // {
        //     count++;
        //     num = num / 10;
        // }

        // System.out.println(count);
        

        //? Find The Sum Of The Digits Of A Number.
        // int num = 189;

            //*  Answer Should Be:- 1 + 8 + 9 = 18

        // int sum = 0;
        // while (num > 0)
        // {
        //     int Remainder = num % 10;
        //     sum = sum + Remainder;
        //     num = num / 10;
        // }
        // System.out.println(sum);

        //? Find The Reverse Of The Number.
        int num = 345;

            // * Answer Should Be:- 543 (Reverse Of 345)

        // int reverse = 0;

        // while (num > 0)
        // {
        //     int Remainder = num % 10;
        //     reverse = reverse * 10 + Remainder;
        //     num = num /10;
        // }

        // System.out.println(reverse);


    }

}
