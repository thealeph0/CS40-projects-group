// Start with a penny
// double it every day
// how much do you have in a 30-day month?
public class DebugSix1
{
   public static void main(String args[])
   {
      final int DAYS = 30;
      double money = 0.01;
      int day = 1;
     //remove the semicolon after the while statement and change > to <
      while(day < DAYS)
      {
         money = 2 * money;
        //we do not have 'days' variable, but we do have day
         ++day;
        //moneyAmt does not exist, money does. 
         System.out.println("After day " + day +
            " you have " + money);
      }
   }
}
