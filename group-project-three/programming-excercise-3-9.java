import java.util.Scanner;
class Insurance {
    public static void main (String args[]) {
        Scanner info = new Scanner(System.in);
        System.out.println("Enter the current year >>");
        int curr=info.nextInt();
        System.out.println("Enter the birth year >>");
        int birth=info.nextInt();
        int premium= calculatePremium(curr, birth);

        System.out.println("The premium is $" + premium);

    }

    public static int calculatePremium(int curr, int birth) {
        int age=curr-birth; //calculate age from input
        int decade=age/10; //get decade from age
        int premium=(decade+15)*20; //premium calculation
        return premium;
    }
