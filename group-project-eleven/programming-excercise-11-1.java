public class UseBook //pre-made
{
   public static void main(String[] args)
   {
      Fiction aNovel = new Fiction("Huckelberry Finn");
      NonFiction aManual = new
         NonFiction("Elements of Style");
      System.out.println("Fiction " +
        aNovel.getTitle() + " costs $" +
        aNovel.getPrice());
      System.out.println("Non-Fiction " +
        aManual.getTitle() + " costs $" +
        aManual.getPrice());
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public abstract class Book
{
   //created fields for the class
   //protected as we will use them and relabel
   protected String title;
   protected double price;

   //constructor for this class
   public Book(String title)
   {
        this.title = title; //this because same variable name
   }
  
  //get methods
   public String getTitle()
   {
       return title;
   }

   public double getPrice()
   {
       return price;
   }

   //abstract method
   public abstract void setPrice();
   
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public class Fiction extends Book //extend the Book class
{
    public Fiction(String title)
    {
        super(title); //fill in superclass
        setPrice(); //quick call to set price
    }
  
    public void setPrice()
    {
        price = 24.99;
    }

}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public class NonFiction extends Book //extend the Book class
{
    public NonFiction(String title)
    {
        super(title); //fill in superclass
        setPrice(); //quick call to set price
    }
  
    public void setPrice()
    {
        price = 37.99;
    }
  
}


