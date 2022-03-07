//Game.java

public class Game {
    private Team team1;
    private Team team2;
    private String time;
    //our parameterized constructor acts like a Setter function
    public Game(Team t1, Team t2, String time) {
        team1 = t1; //set team1
        team2 = t2; //set team2
        this.time = time; //set time. Use this keyword because we have two variables with the same name
    }

    //getter functions
    public Team getTeam1() {
        return team1; 
    }
    public Team getTeam2() {
        return team2;
    }
    public String getTime() {
        return time;
    }
}


//Team.java

public class Team {
    //private class variables
    private String name;
    private String sport;
    private String mascot;
    public final static String MOTTO = "Sportsmanship!"; //same motto for all teams
    /*since the variables from the main that we are passing 
    have the same name as the private variables, we use this keyword
    for every veriable*/
    public Team(String name, String sport, String mascot) {
        this.name = name;
        this.sport = sport;
        this.mascot = mascot;
    }
    /*again since the parameterized constructor did all the 
    setter functions' work, here are the getters
    */
    public String getName() {
        return name;
    }
    public String getSport() {
        return sport;
    }
    public String getMascot() {
        return mascot;
    }
}

//TestGame.java -- given program

public class TestGame
{
   public static void main(String[] args)
   {
      Team team1 = new Team("Roosevelt High", "Girls Basketball", "Dolphins");
      Team team2 = new Team("Hoover High", "Girls Basketball", "Tigers");
      Game game1 = new Game(team1, team2, "7 PM");
      display(game1);
   }
   public static void display(Game g)
   {
      Team t1 = g.getTeam1();
      Team t2 = g.getTeam2();
      System.out.println("The game between " + t1.getName() + " " + t1.getSport() +
         " " + t1.getMascot());
      System.out.println("   and " + t2.getName() + " " + t2.getSport() +
         " " + t2.getMascot());
      System.out.println("   takes place at " + g.getTime());
   }
}

//TestTeam.java -- given program

public class TestTeam
{
   public static void main(String[] args)
   {
      Team team1 = new Team("Roosevelt High", "Girls Basketball", "Dolphins");
      Team team2 = new Team("Hoover High", "Boys Wrestling", "Tigers");
      Team team3 = new Team ("Lincoln High", "Girls Field Hockey", "Gators");
      display(team1);
      display(team2);
      display(team3);
   }
   public static void display(Team t)
   {
      System.out.println(t.getName() + " " + t.getSport() +
         " team " + t.getMascot() + "\n   Our motto is " +
         t.MOTTO);
   }
}
