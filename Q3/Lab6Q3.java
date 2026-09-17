
import java.util.Scanner;

public class ITxxxxxxxxLab6Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int count = 0;
        double sumSquares = 0;

        while (true) {

            System.out.print("Enter a positive number (-99 to stop): ");
            num = input.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input! Enter a positive number.");
                continue;
            }

            sumSquares = sumSquares + (double) num * num;
            count++;
        }

        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {

            double rms = Math.sqrt(sumSquares / count);

            System.out.println("Number of values: " + count);
            System.out.println("Sum of squares: " + sumSquares);
            System.out.println("Root Mean Square: " + rms);
        }

        input.close();
    }
}