package student;

import java.util.ArrayList;

import student.service.College;

public class Course extends Person implements College{
  ArrayList<String> courseName = new ArrayList<String>();
  ArrayList<Integer> credits = new ArrayList<Integer>();
  ArrayList<String> room = new ArrayList<String>();

  public void addCourse(ArrayList<String> courseName, ArrayList<Integer> credits, ArrayList<String> room) {
    this.courseName = courseName;
    this.credits = credits;
    this.room = room;
  }
  public ArrayList<String> getCourseName() {
    return courseName;
  }
  public ArrayList<Integer> getCredits() {
    return credits;
  }
  public ArrayList<String> getRoom() {
    return room;
  }

  public int totalCredit() {
    int newCredit = 0;
    for(int i = 0; i < credits.size(); i++) {
      newCredit += credits.get(i);
    }
    return newCredit;
  }

  @Override
  public void learningPlan() {
    String format = "%10s%2s%20s%2s%10s";
    System.out.println("Learning Plan:");
    System.out.format(format, "ROOM", "|", "COURSE NAME", "|", "CREDITS");
    System.out.println();
    for(int i = 0; i < courseName.size(); i++) {
      System.out.format(format, room.get(i), "|", courseName.get(i), "|", credits.get(i));
      System.out.println();

    }
    System.out.println();
  }

  @Override
  public void studentRegistration() {
    String fullName = totalCredit() >= 144 ? getName() + ", S.T." : getName();
    System.out.println("Full Name: " + fullName);
    System.out.println("Address: " + getAddress());
    System.out.println();
  }

  
  
}
