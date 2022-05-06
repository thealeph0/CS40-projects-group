import java.util.Scanner;
import java.util.ArrayList;
public class Majors {

    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};
   

    public static void main(String[] args) {
        // Write your code here
        Major userMajor;
        String userEntry;
        Scanner input = new Scanner(System.in);
        
        //disp enumerated majors
		for (Major maj: Major.values())
			{
			System.out.println(maj+" ");		
			}	
        //enter major prompt
        System.out.println("Enter a Major>> ");
        userEntry=input.nextLine().toUpperCase();
        userMajor=Major.valueOf(userEntry);
        System.out.print("You entered "+userMajor);

        //Disp division of major
        if(userMajor == Major.ACC){
            System.out.println("\nThis major falls under the BUSINESS division");
        }
        else if(userMajor == Major.CIS){
            System.out.println("\nThis major falls under the BUSINESS division");
        }
        else if(userMajor == Major.CHEM){
            System.out.println("\nThis major falls under the SCIENCE division");
        }
        else if(userMajor == Major.PHYS){
            System.out.println("\nThis major falls under the SCIENCE division");
        }
          else if(userMajor == Major.ENG){
            System.out.println("\nThis major falls under the HUMANITIES division");
        }
        else if(userMajor == Major.HIS){
            System.out.println("\nThis major falls under the HUMANITIES division");
        }
        else {
            System.out.println("Not a major");
        }

    }
}

