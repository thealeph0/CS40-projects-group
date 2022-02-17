import java.util.Scanner;
public class InchConversion 
    {
    public static void main (String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter inches >> ");
        int inches = userInput.nextInt();
        
        convertToFeet(inches);
        convertToYards(inches);
    }

//Must keep as return void and int as input
//in this method we do the calculations and store in apropriate variables
    public static void convertToFeet(int inches) 
    {
        double inch = inches;
        double feet = inch / 12;
        System.out.println(inches+" inches is "+feet+" feet");
    }

//Must keep as return void and int as input
//in this method we do the calculations in the ouput
    public static void convertToYards(int inches) 
    {
        double inch = inches;
        System.out.println(inches+" inches equals "+inch/36+" yards");
    }
}


