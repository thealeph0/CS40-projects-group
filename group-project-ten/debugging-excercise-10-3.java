//DebugBook.java
public class DebugBook
{
   protected int pages;//added data type
   public DebugBook(int pgs)
   {
      pages = pgs;//removed this., pgs variable is local
   }
   public int getPages()
   {
      return pages;//changed variable to pages instead of pgs
   }
}
////////////////////////////////////
//DebugPhoneBook.java
import java.util.*;
public class DebugPhoneBook extends DebugBook
{
   private String area;
   private String size;
   private final int CUTOFF = 30;
   DebugPhoneBook(int pages, String city)
   {
      super(pages);
      area = city;
      if(pages > CUTOFF)
         size = "big";
      else
         size = "small";
   }//finished bracket
   public void display()
   {
      System.out.println("The phone book for " + area +
         " has " + pages + " pages.\nThat is a " +
         size + " phone book."); 
   }
}
////////////////////////////////////
//DebugTen3.java
// A PhoneBook is a Book with a city
import java.util.*;
public class DebugTen3
{
   public static void main(String[] args)
   {
      String area, inStr;
      int pages;//decalred pages var
      Scanner input = new Scanner(System.in);

      System.out.println("Enter city for phone book");
      area = input.next();
      System.out.println("Enter number of pages in " + area + "'s phone book");
      inStr = input.next();
      pages = Integer.parseInt(inStr);
      DebugPhoneBook pb = new DebugPhoneBook(pages, area);//added area parameter
      pb.display();
   }
}
