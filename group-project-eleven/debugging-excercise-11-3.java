// Two boats should be equal
// if they hold the same number of passengers
// and also have the same power source
public class DebugEleven3
{
   public static void main(String args[]) //lowercase 'm'
   {
      DebugRowboat redBoat = new DebugRowboat();
      DebugRowboat blueBoat = new DebugRowboat();
      System.out.print("The two boats are ");
      if(redBoat == blueBoat)
         System.out.println(" equal");
      else
	    System.out.println("not equal"); //System.out.print
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public abstract class DebugBoat
{
   String boatType = new String();
   int passengers; //missing semi
   String power = new String();
   public DebugBoat(String bt) //change 'F' to 'D'
   {
      boatType = bt;
   }
   public boolean equals(DebugBoat otherBoat) //include class type
   {
      boolean result;
      if((passengers == otherBoat.passengers) && (power.equals(otherBoat.power)))
         result = true;
      else
         result = false; //false
      return result; //closing semi
   }
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by "+ power);
   }
   public abstract void setPower();
   public abstract void setPassengers();
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
      setPassengers(); //call Passengers not the Power
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   public void setPower() //capitalize 'P'
   {
      super.power = "oars";
   }
}

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
  
