// Program displays some facts about a string
public class DebugSeven3 //fixed spacing error
{
   public static void main(String[] args)
   { 
      String quote =
         "Honesty is the first chapter in the book of wisdom. - Thomas Jefferson";
      System.out.println("index.of('f') is: " + quote.indexOf('f')); //added .
      System.out.println("index.of('x') is: " + quote.indexOf('x')); //added .
      System.out.println("char.At(5) is: " + quote.charAt(5));
      System.out.println("endsWith(\"daughter\") is: " + quote.endsWith("daughter"));
      System.out.println("endsWith(\"son\") is: " + quote.endsWith("son"));
      System.out.println("replace('e', '*') is: " + quote.replace('e', '*')); //replaced , with +
   }
}

