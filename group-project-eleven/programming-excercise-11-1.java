/*
BookArray.java and UseBook.java were not changed, so I wont include them here
*/

//Book.java
public abstract class Book
{
   // attributes
   String bookTitle;
   double bookPrice;

   // constructor
   public Book(String title){
      bookTitle=title;
   }
   // get and set methods
   public String getTitle(){
       return bookTitle;
   }
   public double getPrice(){
       return bookPrice;
   }
   //include an abstract method named setPrice()
   public abstract void setPrice();
}

//Fiction.java
public class Fiction extends Book
{
    // constructor
    public Fiction(String title){
        super(title);
        setPrice();
    }
    // setPrice()
    public void setPrice(){
        super.bookPrice=24.99;
    }

}


//NonFiction.java
public class NonFiction extends Book
{
    // constructor
    public NonFiction(String title) {
        super(title);
        setPrice();
    }
    // setPrice()
    public void setPrice(){
        super.bookPrice=37.99;
    }
}
