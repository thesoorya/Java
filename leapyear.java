import java.util.Scanner;;

public class leapyear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.println("enter the year: ");
        year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();

    }
}
