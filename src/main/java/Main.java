/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
        System.out.println("What is your name");
        Scanner read = new Scanner(System.in); //this creates a scanner object

        String userInput;
        char firstChar;
        String firstUpper;
        String theRest;
        String result;

        userInput = read.nextLine(); //this reads the user input
        firstChar = userInput.charAt(0); //isolates first character
        firstUpper = Character.toString(firstChar).toUpperCase(); //Upper case for first letter
        theRest = userInput.substring(1).toLowerCase(); //lower case for the rest of the word
        result = firstUpper + theRest; //joining it back together

        if (result.equals("Alice") || result.equals("Bob")) {
            System.out.println ("Hello " + result);
        } else {
            System.out.println("Wrong user");
        }


    }
}
