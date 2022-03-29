//Apartment.java
public class Apartment {
    int aptNumber;
    int bedrooms;
    double baths;
    double rent;
    //parameterized constructor works as a setyter function
    public Apartment(int num, int bdrms, double bths, double rent) {
        aptNumber = num;
        bedrooms = bdrms;
        baths = bths;
        this.rent = rent;
    }
    //getters for aptnumber, bedrooms, bathrooms, and rent
    public int getAptNumber() {
        return aptNumber;
    }
    public int getBedrooms() {
        return bedrooms;
    }
    public double getBaths() {
        return baths;
    }
    public double getRent() {
        return this.rent;
    }

}
//TestApartment.java
import java.util.*;
public class TestApartments {
    public static void main (String args[]) {
        //scanner to input desired beds, baths, and rent
        Scanner input = new Scanner(System.in);
        //five objects to choose from aka available apartments
        Apartment apt1 = new Apartment(101, 2, 1, 725);
        Apartment apt2 = new Apartment(102, 2, 1.5, 775);
        Apartment apt3 = new Apartment(103, 3, 2, 870);
        Apartment apt4 = new Apartment(104, 3, 2.5, 960);
        Apartment apt5 = new Apartment(105, 3, 3, 1100);
        //required variables
        int bdrms;
        int baths;
        double rent;
        //idk what this one is for lol
        int count = 0;
        //interactive part
        System.out.print("Enter minimum number of bedrooms needed >> ");
        bdrms = input.nextInt();
        System.out.print("Enter minimum number of bathrooms needed >> ");
        baths = input.nextInt();
        System.out.print("Enter maximum rent willing to pay >> ");
        rent = input.nextDouble();
        System.out.println("\nApartments meeting citeria of\nat least " + bdrms +
                           " bedrooms, at least " + baths + " baths, and " + " no more than $" +
                           rent + " rent:");

        // Write your code here
        //here we are passing the objects and the inputted data to a function that checks for boolean values
        checkApt(apt1, bdrms, baths, rent);
        checkApt(apt2, bdrms, baths, rent);
        checkApt(apt3, bdrms, baths, rent);
        checkApt(apt4, bdrms, baths, rent);
        checkApt(apt5, bdrms, baths, rent);
    }
    public static boolean checkApt(Apartment apt, int bdrms, double baths, double rent) {
        //if the passed objects match the requirements typed by users
        if(bdrms <= apt.getBedrooms() && baths <= apt.getBaths() && rent >= apt.getRent())
        {
            //display and return true
            display(apt);
            return true;
        }
        else
        {
            //display no matching apts and return false
            System.out.println("No apartments met your criteria");
            return false;
        }
    }
    //prewritten display fn.
    public static void display(Apartment apt) {
        System.out.println("   Apt #" + apt.getAptNumber() + "    " + apt.getBedrooms() +
                           " bedrooms, and " + apt.getBaths() + " baths. Rent $" + apt.getRent());
    }
}


