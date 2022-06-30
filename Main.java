
public class Main {

    public static void main(String[] args) {

        // This is inspired by https://www.w3schools.com/java/default.asp



        /*
            Comments
         */

        //      With comments you can add text like this to your code and the code doesn't recognize it.

        // For short one line comments

        /*
           For long comments
         */



        /*
             Variables
         */

         /*
                For variables there are different types, for example:

                String - stores text, such as "Hello". String values are surrounded by double quotes
                int - stores integers (whole numbers), without decimals, such as 123 or -123
                float - stores floating point numbers, with decimals, such as 19.99 or -19.99
                char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
                boolean - stores values with two states: true or false
          */

         // String
         String name = "Your Name"; // Set's the value of a String type variable
         System.out.println(name);

         // Integers
         int myNum = 15; // Set's the type(int) and the value of the variable
         System.out.println(myNum);

         int myNum2; // The type can be specified before the variable get's a value
         myNum2 = 25;
         System.out.println(myNum2);

         int myNum3 = 15;
         myNum3 = 20; // Overwrites the old variable
         System.out.println(myNum3);

         final int myfinal = 10; // The keyword "final" make it impossible for the code to change this variable.
         //myfinal = 30; // When you remove the first // from this line you should get an error.
         System.out.println(myfinal);

        /*
                You can make this with all types, you just need to remember when you are using a String you need "".
         */



        /*
            Print Variables
         */
        
        
    }
}