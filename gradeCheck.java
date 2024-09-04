import java.util.Scanner;

public class gradeCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int mark;

        do {
            System.out.print("Enter the mark: ");
            mark = scanner.nextInt();

            if (mark > 100 || mark < 0) {
                System.out.println("Enter a valid mark (between 0 and 100)");
            }
        } while (mark > 100 || mark < 0);

        if(mark > 90){
            System.out.println("A grade");
        }
        else if(mark < 89 && mark > 80){
            System.out.println("B Grade");
        }
        else if(mark < 79 && mark > 70){
            System.out.println("C Grade");
        }
        else if(mark < 69 && mark > 60){
            System.out.println("D Grade");
        }
        else{
            System.out.println("Fail F Grade");
        }

        scanner.close();
    }
}
