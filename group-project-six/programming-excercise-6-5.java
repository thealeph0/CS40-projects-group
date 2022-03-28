public class Perfect {
    public static void main (String args[]) 
    {
        for(int i = 2 ; i <= 1000 ; i++)
        {
            if(perfect(i)==true)
                System.out.println("The number " + i + " is perfect.");
        }    
    }

    public static boolean perfect(int n) 
    {
        int sum = 1;
        for (int i = 2; i <= (n / 2) && sum <=n; i++) 
        {
            if (n % i == 0) 
            {
                sum += i;
            }
        }
    return sum == n;
     }
}


