public class MathTest {
    public static void main(String[] args) {
        // Write your code here
        //number 1
        System.out.println(Math.sqrt(37));
        //number 2
        System.out.println(Math.sin(300));
        System.out.println(Math.cos(300));
        //number 3
        double x=22.8;
        System.out.println(Math.floor(x)); //rounds down
        System.out.println(Math.ceil(x)); //rounds up
        System.out.println(Math.round(x)); //rounds to nearest whole number
        //number 4
        int y='D'; //integer value of character D
        System.out.println(Math.max(y, 71));
        System.out.println(Math.min(y, 71));
        //number 5
        double z= Math.random()*20; //gets rand # btwn 0 and 1 multiplied by 20
        System.out.println(z);

    }
}
