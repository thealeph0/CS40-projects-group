public class DebugTwo3
{
   public static void main(String[] args) //missing parenthesis and brackets
   {
      int a = 99, b = 8, result; // missing comma after 99
      long c = 7777777777777L; //longs require an L at the end
      result = a % b; // missing a semi-colon
     
      System.out.println("Divide " + a + " by " + b);
      System.out.println("remainder is " + result);
      System.out.print("c is a very large number: ");
      System.out.println(c);
    }
}
