public class DebugBox
{
   private int width;
   private int length;
   private int height;
   public DebugBox()
   {
      length = 1;
      width = 1;
      height = 1;
   }
   public DebugBox(int width, int length, int height) //add the this keyword
   {
      this.width = width;
      this.length = length;
      this.height = height;
   }
   public void showData()
   {
      System.out.println("Width: " + width +  " Length: " +
        length + "  Height: "+ height); // edit location of quotes
   }
   public double getVolume()
   { 
      double vol = length * width * height; //syntax
      return vol;
   }
}

