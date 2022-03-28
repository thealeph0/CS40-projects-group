public class Factorials
{
   public static void main (String args[])
   {
       int n = 10;
       int factorial = 1;
       int j =1;

       while(j<=n)
       {
           factorial *= j;
       System.out.println("The factorial of "+ j + " is " + factorial);
       j++;
       }
   }
}
