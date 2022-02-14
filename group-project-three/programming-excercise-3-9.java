import java.util.Scanner; //Scanner class added to a program
class Insurance {
    public static void main (String args[]) {
        // Write your code here
        Scanner getData = new Scanner(System.in); //Scanner object
        System.out.print("Enter the current year >> ");//Prompting current year
        int year = getData.nextInt();//current year
        System.out.print("Enter the birth year >> ");//prompting birth year
        int birth = getData.nextInt();//birth year
        System.out.println("The premium is $" + calculatePremium(year, birth)); //printing out a statement using a function that we passed variables to.
    }

    public static int calculatePremium(int curr, int birth) {
        // Write your code here
        int age = curr-birth; //calculating age
        float buffer = age/10; //I created a 'buffer' variable to round for the decase
        int decade = Math.round(buffer); //rounding our buffer down
        int premium = (15+decade)*20; //premium calculation
        return premium; //return statement
    }
}

