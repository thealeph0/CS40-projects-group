
public class DebugSeven1
{
   public static void main(String[] args)
   {
      String name1 = "Roger";
      String name2 = "Roger";
      String name3 = "Stacy";
      if(name1.equals(name2))
        System.out.println(name1 + " and " + name2 +
          " are the same");
      if(name1.equals(name3))
      //changed name2 to name3 to fix the logic error
        System.out.println(name1 + " and " + name3 +
          " are the same");
          //missing quotes after roger
         // semi colons not needed after the if statements
      if(name1.equals("roger"))
        System.out.println(name1 + " and 'roger' are the same");
      if(name1.equals("Roger"))
        System.out.println(name1 + " and 'Roger' are the same");
   }
}
