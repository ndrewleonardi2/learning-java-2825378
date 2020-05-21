import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Hammon";

        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of: " + studentGPA);
        System.out.println("What do you want to update it to?");

        //Creates an instance of scanner class to access stud in
        Scanner input = new Scanner(System.in);

        studentGPA = input.nextDouble();

        System.out.println(studentFirstName + " " + studentLastName + " NOW has a GPA of: " + studentGPA);
    }
}
