import java.util.Scanner;

/*
   01/04/23
   1) Write a program that fills an array with N integers entered by the user. 
 */

class exercise01 {
    public static void main ( String[] args ) {

        Scanner input = new Scanner ( System.in );

        System.out.println( "How many elements do you want to store in the Array? (Max 20)"  );
        int number = input.nextInt();
        
        do {
            System.out.println( "Invalid number, please try again (between 0-20)" );
            number = input.nextInt();
        } while( number > 20 || number <= 0 );
        

        System.out.println("Wait until next update..."); 

        input.close();
    }
}