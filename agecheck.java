import java.util.Scanner;

public class agecheck {
    public static void main(String[] args) {

        int age;

        Scanner scanner = new Scanner(System.in);
        
        age = scanner.nextInt();

        if (age >= 65) {
            System.out.println("You are eligible to retire");
        }
        else{
            System.out.println("You are not eligible to retire");
        }

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }

        if (age >= 16) {
            System.out.println("You are eligible to drive");
        }
        else{
            System.out.println("You are not eligible to drive");
        }

        scanner.close();

    }
}
