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
        System.out.println("You entered : " + student1.getName());
        System.out.println("student email :"+ student1.getEmail());
        System.out.println("student course :"+ student1.getCourse());


    }
}