
import java.util.*;
public class CountWords {
    public static void main(String[] args) {

        String words;
        int totalWords = 0;
        
        //define scanner and take in input from user
        Scanner dagg = new Scanner(System.in);

        System.out.print("Enter a string >> ");
        words = dagg.nextLine();


        //loop that will run through every character
        for(int x = 0; x < words.length(); x++)
        {
            //if we run into the case where the character we are currently located at is a letter
            //and the character next to us is not a letter, then we must be a punctuation or space; increase counter
            if(x>0 && Character.isLetter((words.charAt(x-1))) && !Character.isLetter(words.charAt(x)))
            {
                totalWords++;
            }
            //this handles the case if when we do not end with any form of punctuation
            //this counts the last word
            else if(Character.isLetter(words.charAt(x)) && (x == words.length() -1 ))
            {
                totalWords++;
            }
            
        }

      //SUCCESS 
      System.out.println("There are " + totalWords + " words in the string.");
        
    }
}


