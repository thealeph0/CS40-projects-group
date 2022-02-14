// This application gets a user's name and displays a greeting
import java.util.Scanner;
public class DebugThree3
{
   public static void main(String[] args) // incorrect parameters of main
   {
      String name;
      name = getName(); // missing closure 
      displayGreeting(name);  // one 'm' not two         
   }
   public static String getName() //keep parameters blank
   {
      String namer; // added extra 'r' 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name "); //System.OUT.print
      namer = input.nextLine(); // added 't' for 'l'
      return namer; 
   }
   public static void displayGreeting(String names) // return void
   {
      System.out.println("Hello, " + names + "!"); //added dot btwn out and print
   }
}

