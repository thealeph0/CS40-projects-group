import java.util.Scanner;
public class InchConversion {
    public static void main (String args[]) {
        Scanner userInput=new Scanner(System.in);
        System.out.print("Enter inches >>");
        double inches=userInput.nextDouble();

        double feet=convertToFeet(inches);
        double yards=convertToYards(inches);

        System.out.println(inches+" inches is "+feet+" feet");
        System.out.println(inches+" inches is "+yards+" yards");
    }

    public static double convertToFeet(double inches) {
        double feet=inches / 12;
        return feet;
    }
    public static double convertToYards(double inches) {
        double yards=inches / 36;
        return yards;
    }
}

