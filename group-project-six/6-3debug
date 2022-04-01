// Prompt user for value to start
// Value must be between 1 and 20 inclusive
// At command line, count down to blastoff
// With a brief pause between each displayed value
import java.util.*;
public class DebugSix3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String userNumString;
    int userNum, val;
    final int MIN = 1;
    final int MAX = 20;
    System.out.println("Enter a number between " + MIN + " and " + MAX + " inclusive");
    userNumString = input.next();
    userNum = Integer.parseInt(userNumString); //fixed typo in integer
    while(userNum < MIN || userNum > MAX) //changed second argument to boolean(>) instead of int(=)
    {
       System.out.println("Number out of range" +
       "\nEnter a number between " + MIN + " and " + MAX + " inclusive");
       userNumString = input.next();
       userNum = Integer.parseInt(userNumString); //parse missing "Int"
    }
    for(val = userNum; val > 0; val--) //fixed logic error with comparison sign
    {
      System.out.print(val + "  ");
      for(int x = 0; x < 100000; ++x)
        for(int y = 0; y < 10000; ++y);
        // Adjust these numbers for faster or slower performance
    }
    System.out.println("Blastoff!");
  }
}

