package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    Course course = new Course();

    Scanner sc = new Scanner(System.in);

    ArrayList<String> courseName = new ArrayList<String>();
    ArrayList<Integer> credits = new ArrayList<Integer>();
    ArrayList<String> room = new ArrayList<String>();

    boolean continueAddCourse;

    System.out.println("===============Student Registration==============");
    System.out.print("Enter your name: ");
    String name = sc.nextLine();


    System.out.print("Enter your address: ");
    String address = sc.nextLine();

    course.setPerson(name, address);

    do{
      continueAddCourse = false;
      System.out.println();
      System.out.print("Add course: ");
      courseName.add(sc.nextLine());

      System.out.print("Add credits: ");
      credits.add(sc.nextInt());
      
      System.out.print("Add room: ");
      room.add(sc.next());

      System.out.println();

      System.out.println("Add more? (y/n)");
      String more = sc.next();
      sc.nextLine();
      if(more.equalsIgnoreCase("y")){
        continueAddCourse = true;
      }

    }while(continueAddCourse);

    System.out.println();

    course.addCourse(courseName, credits, room);

    course.studentRegistration();
    course.learningPlan();
    System.out.println("Total Credits: " + course.totalCredit());

    
    sc.close();
  }
  
}
