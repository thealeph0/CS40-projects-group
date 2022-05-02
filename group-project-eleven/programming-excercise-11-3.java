public class DemoSubscriptions
{
    public static void main(String args[])
    {
        PhysicalNewspaperSubscription pnsGood = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsGood = new OnlineNewspaperSubscription();
        PhysicalNewspaperSubscription pnsBad = new PhysicalNewspaperSubscription();
        OnlineNewspaperSubscription onsBad = new OnlineNewspaperSubscription();
        pnsGood.setName("DePalma");
        pnsGood.setAddress("23 Oak Avenue");
        display(pnsGood);
        pnsBad.setName("Gomez");
        pnsBad.setAddress("Maple Street");
        display(pnsBad);      
        onsGood.setName("Carter");
        onsGood.setAddress("carter@myMail.com");
        display(onsGood);
        onsBad.setName("Lee");
        onsBad.setAddress("Elm Street");
        display(onsBad); 
    }
    public static void display(NewspaperSubscription n)
    {
        System.out.println("Name: " + n.getName() + "   Address: " +
                n.getAddress() + "   Rate: " + n.getRate() + "\n");
    }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public abstract class NewspaperSubscription
{
    protected String name;
    protected String address;
    protected double rate;
    //get and set methods
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public String getAddress()
    {
        return address;
    }
    public double getRate()
    {
        return rate;
    }
    //abstract method
    public abstract void setAddress(String s);
}


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    public void setAddress(String a)
    {
        if(a.contains("@")) //check string for email character
        {
            rate = 9;
            address = a;
        }
            
        else
        {
            name = "null"; //not needed
            rate = 0;
        }
            
    }

}


%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    public void setAddress(String a)
    {
        if(Character.isDigit(a.charAt(0))) //check for digit at start
        {
            rate = 15;
            address = a;
        }
        else
        {
            rate = 0;

        }
    }

}


