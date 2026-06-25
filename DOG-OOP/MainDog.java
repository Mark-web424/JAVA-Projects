import java.util.Scanner;

public class MainDog {
    static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
    //    // create object
    //     Dog Ginger = new Dog();
    //     Ginger.display();

    //     //2 

    //     System.out.print(""); String b = input.nextLine();
    //     System.out.print(""); String ss = input.nextLine();
    //     Dog two = new Dog(b, ss);
    //     two.display();

        char answer = ' ';
        do{
            System.out.print("Enter name: "); String name  = input.nextLine();
        
            System.out.print("Enter age: "); int yb = input.nextInt();input.nextLine();
            
            System.out.print("Enter breed: "); String b = input.nextLine();
        
            System.out.print("Enter shot status: "); String ss = input.nextLine();

            Dog tres = new Dog(name, yb, b, ss);
            tres.display();
            System.out.print("Do you want to repeat again? Answer: ");
            answer = input.next().toUpperCase().charAt(0);
            input.nextLine();
        } while (answer =='Y');

    }
    
}
