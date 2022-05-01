public class DemoHorses //pre-made
{
    public static void main(String args[])
    {
       Horse horse1 = new Horse();
       RaceHorse horse2 = new RaceHorse();
       horse1.setName("Old Paint");
       horse1.setColor("brown");
       horse1.setBirthYear(2009);
       horse2.setName("Champion");
       horse2.setColor("black");
       horse2.setBirthYear(2011);
       horse2.setRaces(4);
       System.out.println(horse1.getName() + " is " +
          horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
       System.out.println(horse2.getName() + " is " +
          horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
       System.out.println(horse2.getName() + " has been in " +
          horse2.getRaces() + " races.");
    }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public class Horse
{
   //three fields for the Horse class
   private String name;
   private String color;
   private int birthYear;
   //get and set methods for the fields
   public String getName()
   {
       return name;
   }

   public void setName(String horse)
   {
       name = horse;
   }

   public String getColor()
   {
       return color;
   }

   public void setColor(String c)
   {
       color = c;
   }

   public int getBirthYear()
   {
       return birthYear;
   }

   public void setBirthYear(int b)
   {
       birthYear = b;
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
public class RaceHorse extends Horse //subclass of Horse
{
    private int races;
    //get and set of additional field
    public int getRaces()
    {
        return races;
    }

    public void setRaces(int runs)
    {
        races = runs;
    }
}

