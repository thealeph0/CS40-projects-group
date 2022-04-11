import java.util.Scanner;
public class InputCharacterInfo {
    public static void main(String[] args) {
        // Write your code here
        char aChar; //the char we get from user
        Scanner sc = new Scanner(System.in); //creating a scanner object to get user input
        System.out.print("Enter a character>> "); //prompt
        aChar = sc.nextLine().charAt(0); //char with methods used to get it from user
        System.out.print("The character is " + aChar); // print character
        if(Character.isUpperCase(aChar)) //if the character is upper case, state so
        {
            System.out.println(aChar + " is uppercase.");
        }
        else //else, say it's not uppercase
        {
            System.out.println(aChar + " is not uppercase.");
        }
        if(Character.isLowerCase(aChar)) //if the character is lower case, state so
        {
            System.out.println(aChar + " is lowercase.");
        }
        else //state it's not lower case
        {
            System.out.println(aChar + " is not lowercase.");
        }
        aChar =Character.toLowerCase(aChar); //use toLowerCase function to transform character to a lower case version
        System.out.println("After toLowerCase(), aChar is " + aChar); //print lower case version
        aChar =Character.toUpperCase(aChar); //use toUpperCase function to transform character to a lower case version
        System.out.println("After toUpperCase(), aChar is " + aChar); //print uppercase version
        if(Character.isLetterOrDigit(aChar)) //check whether char is a letter or digit, and not a whitespace.
        {
            System.out.println(aChar + " is a letter or digit.");
        }
        else
        {
            System.out.println(aChar + " is neither a letter nor a digit."); //no = no:)
        }
        if(Character.isWhitespace(aChar)) //check if its whitespace, and not a letter or digit
        {
            System.out.println(aChar + " is whitespace"); 
        }
        else
        {
            System.out.println(aChar + " is not whitespace"); //not whitespace
        }
    }
}
