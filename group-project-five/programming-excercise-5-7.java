//JobApplicant.java
public class JobApplicant {
    private String name;
    private String phone;
    private boolean hasWordSkill;
    private boolean hasSpreadsheetSkill;
    private boolean hasDatabaseSkill;
    private boolean hasGraphicsSkill;
    //parameterized constructor
    public JobApplicant(String name, String phone, boolean w, boolean s, boolean d, boolean g) {
        this.name=name;
        this.phone=phone;
        hasWordSkill=w;
        hasSpreadsheetSkill=s;
        hasDatabaseSkill=d;
        hasGraphicsSkill=g;
    }
    //getters
    public String getName() {
        return name;
    }
    public String getPhone() {
        return phone;
    }
    public boolean getHasWordSkill() {
        return hasWordSkill;
    }
    public boolean getHasSpreadsheetSkill() {
        return hasSpreadsheetSkill;
    }
    public boolean getHasDatabaseSkill() {
        return hasDatabaseSkill;
    }
    public boolean getHasGraphicsSkill() {
        return hasGraphicsSkill;
    }
}

//TestJobApplicants.java
import java.util.Scanner;
public class TestJobApplicants
{
   public static void main(String[] args)
   {
      JobApplicant app1 = new JobApplicant("Johnson", "312-345-9875",
            true, false, true, false);
      JobApplicant app2 = new JobApplicant("Kermit", "312-543-1275",
            true, false, false, false);
      JobApplicant app3 = new JobApplicant("Lawrence", "608-288-09125",
            true, false, true, true);
      JobApplicant app4 = new JobApplicant("Mitchell", "815-288-3881",
            true, true, true, true);
      String qualifiedMsg = "is qualified for an interview   ";
      String notQualifiedMsg = "is not qualified for an interview at this time   ";

      //passing objects into functions, displayed msg is dependant on isQualified boolean
      if (isQualified(app1) ==true) {
          display(app1, qualifiedMsg);
      } else{
          display(app1, notQualifiedMsg);
      }
      if (isQualified(app2) ==true) {
          display(app2, qualifiedMsg);
      } else{
          display(app2, notQualifiedMsg);
      }
      if (isQualified(app3) ==true) {
          display(app3, qualifiedMsg);
      } else{
          display(app3, notQualifiedMsg);
      }
      if (isQualified(app4) ==true) {
          display(app4, qualifiedMsg);
      } else{
          display(app4, notQualifiedMsg);
      }
      

   }
   public static boolean isQualified(JobApplicant app)
   {
      //if (w and s) or (d and g) is true, is qualified
      if ((app.getHasWordSkill()&&app.getHasSpreadsheetSkill())||(app.getHasDatabaseSkill()&&app.getHasGraphicsSkill())==true){
        return true;
      } else{
            return false;
      }
   }
   public static void display(JobApplicant app, String msg)
   {
      System.out.println(app.getName() + " " + msg +
         "  Phone: " + app.getPhone());
   }
}
