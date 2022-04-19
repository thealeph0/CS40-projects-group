CollegeCourse.java

public class CollegeCourse {
    private String courseID;
    private int credits;
    private char grade;
    public String getID() {
        return courseID;
    }
    public int getCredits() {
        return credits;
    }
    public char getGrade() {
        return grade;
    }
    public void setID(String idNum) {
        courseID = idNum;
    }
    public void setCredits(int cr) {
        credits = cr;
    }
    public void setGrade(char gr) {
        grade = gr;
    }
}


InputGrades.java

import java.util.*;
public class InputGrades {
    public static void main(String[] args) {
        // Write your code here
        Student[] studnt = new Student[10];
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i<10; ++i)
        {
            System.out.println("Enter ID for Student #" + (i+1));
            studnt[i] = new Student();
            studnt[i].setID(input.nextInt());
            for(int j = 0; j<5; ++j)
            {
                CollegeCourse c = new CollegeCourse();
                System.out.println("Enter course ID#" + (j+1));
                c.setID(input.next());
                System.out.println("Enter credits for " + c.getID());
                c.setCredits(input.nextInt());
                System.out.println("Enter grade for " + c.getID());
                c.setGrade(input.next().charAt(0));
                studnt[i].setCourse(c, j);
            }
        }
        for(int i = 0; i<10; ++i)
        {
            System.out.println("Student #" + (i+1) + "ID #"+studnt[i].getID());
            for(int j = 0; j<5; ++j)
            {
                System.out.println(studnt[i].getCourse(j).getID()+ " "+studnt[i].getCourse(j).getCredits()+"  -- credits. Grade is " +studnt[i].getCourse(j).getGrade());
            }
        }
    }
}

Student.java

public class Student {
    private int stuID;
    private CollegeCourse[] course = new CollegeCourse[5];

    public int getID() {
        return stuID;
    }
    public CollegeCourse getCourse(int x) {
        return course[x];
    }

    public void setID(int idNum) {
        stuID = idNum;
    }
    public void setCourse(CollegeCourse c, int x) {
        course[x] = c;
    }
}
