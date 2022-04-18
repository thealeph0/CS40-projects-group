//Purchase.java
public class Purchase
{
   private int invoiceNumber;
   private double saleAmount;
   private double tax;
   private static final double RATE = 0.05;
   public void setInvoiceNumber(int num)
   {
      invoiceNumber = num;
   }
   public void setSaleAmount(double amt)
   {
      saleAmount = amt;
      tax = saleAmount * RATE;
   }
   public double getSaleAmount()
   {
      return saleAmount;
   }
   public int getInvoiceNumber()
   {
      return invoiceNumber;
   }
   public void display()
   {
      System.out.println("Invoice #" + invoiceNumber +
         "  Amount of sale: $" + saleAmount + "  Tax: $" + tax);
   }
}

/////////////////////////////////////////////////////////////////////////////////////////////

//SortPurchaseArray.java

import java.util.Scanner;
public class SortPurchasesArray {
    public static void main(String[] args) 
    {
        Purchase[] purchases = new Purchase[5];
        Scanner key = new Scanner(System.in);
        String entry = "";
        int invNum;
        double saleAmt;

        int i = 0;

        for(int j = 0; j < purchases.length; ++j)
        {
            purchases[j] = new Purchase();

            System.out.print("Enter invoice number >> ");
            invNum = key.nextInt();
            purchases[j].setInvoiceNumber(invNum);
            
            System.out.print("Enter a sale amount >> ");
            saleAmt = key.nextDouble();
            purchases[j].setSaleAmount(saleAmt);
        }

        key.nextLine();

        System.out.print("Sort Purchases by (I)nvoice number, or (S)ales amount? ");
        entry = key.nextLine();

        if(entry.charAt(0) == 'I')
        {
            sortByInvoice(purchases);
            String msg = "Sorted by Invoice";
            display(purchases , msg );
        }
        else if(entry.charAt(0) == 'S')
        {
            sortBySaleAmount(purchases);
            String msg = "Sorted by Invoice";
            display(purchases , msg);
        }

        while(i < 1)
        {
            System.out.print("Sort Purchases by (I)nvoice number, or (S)ales amount? ");
            System.out.print("\t or enter Z to quit >> ");
            entry = key.nextLine();

            if(entry.charAt(0) == 'I')
        {
            sortByInvoice(purchases);
            String msg = "Sorted by Invoice";
            display(purchases , msg );
        }
        else if(entry.charAt(0) == 'S')
        {
            sortBySaleAmount(purchases);
            String msg = "Sorted by Invoice";
            display(purchases , msg);
        }
        else if(entry.charAt(0) == 'Z')
        {
            ++i;
            System.out.print("Goodbye");
        }
        
        }

    }

    public static void sortBySaleAmount(Purchase[] array)
    {
        Purchase temp;
        for(int a = 0 ; a < array.length - 1 ; ++a)
        {
            for(int b = 0; b < array.length - 1; ++b)
            {
                if(array[b].getSaleAmount() > array[b+1].getSaleAmount())
                {
                    temp = array[b];
                    array[b] = array[b+1];
                    array[b+1] = temp;
                }
                
            }
        }        
    }

    public static void sortByInvoice(Purchase[] array)
    {
       Purchase temp;
        for(int a = 0 ; a < array.length - 1 ; ++a)
        {
            for(int b = 0; b < array.length - 1; ++b)
            {
                if(array[b].getInvoiceNumber() > array[b+1].getInvoiceNumber())
                {
                    temp = array[b];
                    array[b] = array[b+1];
                    array[b+1] = temp;
                }
                
            }
        }        
    }

    public static void display(Purchase[] p, String msg)
    {
        System.out.println(msg);
        for(int j = 0; j < p.length; ++j)
        {
            p[j].display();
        }


    }

}

