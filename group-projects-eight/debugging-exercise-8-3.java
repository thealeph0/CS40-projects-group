// Application looks up home price
// for different floor plans
// allows upper or lowercase data entry
import java.util.*;
public class DebugEight3
{
   public static void main(String[] args)
   { 
      Scanner input = new Scanner(System.in);
      String entry;
      char[] floorPlans = {'A','B','C','a','b','c'}; //added semicolon to end of line
      int[] pricesInThousands = {145, 190, 235};
      char plan;
      int x, fp = 99;
      String prompt = "Please select a floor plan\n" +
          "Our floorPlanss are:\n" + "A - Augusta, a ranch\n" +
          "B - Brittany, a split level\n" +
          "C - Colonial, a two-story\n" +
          "Enter floorPlans letter";
      System.out.println(prompt);
      entry = input.next();
      plan = entry.charAt(0); //changed 1 to 0
     for(x = 0; x < floorPlans.length; ++x){
	    if(plan == floorPlans[x])
           fp = x; //changed order so fp = x instead of x=fp
     if(fp == 99) //changed = to ==
        System.out.println("Invalid floor plan code entered");
     else
      {
        if(fp >= 3)
           fp = fp - 3;
        System.out.println("Model " +
           plan + " is priced at only $" +
           pricesInThousands[fp] + ",000");//fixed spelling error
      }
   }
}
} //completed bracket
