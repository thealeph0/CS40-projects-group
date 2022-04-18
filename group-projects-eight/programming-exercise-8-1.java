public class NineInts {
    public static void main (String args[]) 
    {
        int[] numbers = {10,15,19,23,26,29,31,34,38}; //declare and initialize
        int n = numbers.length; //used for loops
        int temp; //used for swapping elements to put in reverse order

        for(int i = 0; i < n ; ++i) //runs through and prints every element in array
        {
            System.out.print(numbers[i] + " ");
        }

        for(int i = 0; i <= n/2 ; ++i) //runs up to the half point
        {
            temp = numbers[i]; //temporarily stores 1st element 
            numbers[i] = numbers[n-i-1]; // then swaps the element at the end
            numbers[n-i-1] = temp; //then stores 1st element(temp) to the end
        }
        //inch worms from the inside out

        System.out.print("\n"); //for aesthetic on the output

        for(int i = 0; i < n ; ++i) //runs through and prints every element in array
        {
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\n"); //for aesthetic on the output
    }
}
