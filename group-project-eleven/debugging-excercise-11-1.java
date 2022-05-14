DebugBoat.java
public abstract class DebugBoat
{
   String boatType = new String();
  //semicolon
   int passengers;
   String power = new String();
  //Febug to Debug
   public DebugBoat(String bt)
   {
      boatType = bt;
   }
  //add class data type DebugBoat
   public boolean equals(DebugBoat otherBoat)
   {
      boolean result;
      if(passengers==otherBoat.passengers && (power.equals(otherBoat.power)))
      {
         result = true;
      }
      else
      {
        //change the boolean value for result tho it didn't change anything
         result = false;
      }
     //semi
      return result;
   }
  //fix the quotation mark
   public String toString()
   {
      return("This " + boatType + "boat carries " + passengers +
        " and is powered by " + power);
   }
   public abstract void setPower();
   public abstract void setPassengers();
}
DebugEleven1.java
// Instantiates Rowboat
// Rowboat is child of Boat
public class DebugEleven1
{
   public static void main(String[] args)
   {
     //add new keyword
      DebugRowboat myBoat = new DebugRowboat();
     //add toString() after myBoat instance
      System.out.println(myBoat.toString());
   }
}
DebugRowboat.java
public class DebugRowboat extends DebugBoat
{
   public DebugRowboat()
   {
      super("row");
      //add setPassengers method
      setPassengers();
      setPower();
   }
   public void setPassengers()
   {
      super.passengers = 2;
   }
   //fix function name
   public void setPower()
   {
      super.power = "oars";
   }
}
