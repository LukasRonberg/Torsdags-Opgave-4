import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	private static int rnd_number;


    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");
        makeAGuess();
 	}


    private static void makeAGuess(){
		// Create a Scanner object  

        Scanner scan = new Scanner(System.in); 	 
    	// Read user input
        int input;
         

        if(scan.hasNextDouble()){
           input = scan.nextInt();
           if(rnd_number == input){
            System.out.println("You found the random number!");
           } else{
            System.out.println("Try again, you will find it soon!");
            makeAGuess();
           }  

        } else {
            System.out.println("Input is not numeric, try again.");
            makeAGuess();
        }
                //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }


}