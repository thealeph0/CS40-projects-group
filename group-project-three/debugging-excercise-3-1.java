
// This class calculates a waitperson's tip as 15% of the bill
public class DebugThree1
{
   public static void main(String [] args)
   {
       /*syntax error check was lowercase*/
      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are");
      calcTip(myCheck);
      calcTip(yourCheck);
    }//missing static in calcTip method
    public static void calcTip(double bill)
    {
       final double RATE = 0.15;
       double tip;
       //symantics error , changed check to bill
       tip = bill * RATE;
       System.out.println("The tip should be at least " + tip);
    }
}
