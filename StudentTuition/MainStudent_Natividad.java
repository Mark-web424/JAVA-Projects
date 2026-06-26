import java.util.Scanner;

public class MainStudent_Natividad{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String repeat;
        int count = 0;

        do {
            System.out.println("Entering student Details");

            System.out.print("Student No : ");
            int studentNo = input.nextInt();
            input.nextLine();

            System.out.print("Name : ");
            String name = input.nextLine();

            System.out.println("Enter your course based on the following : ");
            System.out.println("CS - Computer Science");
            System.out.println("EMC - Entertainment and MultiMedia Computing");
            System.out.println("NETAD - IT Net Administration");
            System.out.println("WEBDEV - IT Web Development");

            System.out.print("Course : ");
            String course = input.nextLine();

            System.out.print("Enter your No of units enrolled : ");
            int units = input.nextInt();

            Student_Natividad student = new Student_Natividad(studentNo, name, course, units);
            student.display();

            count++;

            System.out.print("\nDO YOU WANT TO REPEAT AGAIN? Answer [Y/y] : ");
            repeat = input.next();

        } while (repeat.equalsIgnoreCase("y"));

        System.out.println("\nYou have entered " + count + " students.");
        System.out.println("Thank you for using my program.");

        input.close();
    }
}