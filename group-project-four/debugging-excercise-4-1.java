
// This program assigns values to two variables
// and performs mathematical operations with them
public class DebugFour1
{
   //added a void to the return type
   // changed the position of the brackets to after string 
   public static void main(String[] args)
   {//added a semicolonafter the 5 to close off the variable
      int x = 5;
      int y = 8;
      //moved int z up to have a cleaner code
      int z = 19;
      
      /*added parenthese to make the operations work*/
      System.out.println("adding " +( x + y));
      System.out.println("subtracting " +( z - y));
      System.out.println("dividing " + (z / x));
      // change the operation sign
      System.out.println("multiplying " + (x * z));
   }
}
