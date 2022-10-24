package ie.atu.studentApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Please enter Student Name");
        Scanner input = new Scanner(System.in);
        Student student1 = new Student();
        String name = input.nextLine();
        student1.setName(name);
        System.out.println("Please enter Student email");
        String email = input.nextLine();
        student1.setEmail(email);
        System.out.println("Please enter Student course");
        String course= input.nextLine();
        student1.setCourse(course);


        //* second instance*//
        System.out.println("Please enter Student 2 Name");
        String name1 = input.nextLine();
        Student student2 = new Student(name1);
        System.out.println("Please enter Student 2 email");
        String email1 = input.nextLine();
        student2.setEmail(email1);
        System.out.println("Please enter Student 2 course");
        String course1 = input.nextLine();
        student2.setCourse(course1);

        // third instance*//
        System.out.println("Please enter Student 3 Name");
        String name2 = input.nextLine();
        System.out.println("Please enter Student 3 email");
        String email2 = input.nextLine();
        System.out.println("Please enter Student 3 course");
        String course2 = input.nextLine();
        Student student3 = new Student(name2,email2,course2);

        System.out.println("student 1 name : " + student1.getName());
        System.out.println("student 1 email :"+ student1.getEmail());
        System.out.println("student 1 course :"+ student1.getCourse());

        System.out.println("student 2 name: " + name1);
        System.out.println("student 2 email :"+ student2.getEmail());
        System.out.println("student 2 course :"+ student2.getCourse());

        System.out.println("student 3 name: " + name2);
        System.out.println("student 3 email :"+ email2);
        System.out.println("student 3 course :"+ course2);

    }
}