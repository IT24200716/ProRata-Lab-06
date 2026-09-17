
import java.util.Scanner;

public class Lab6Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        double square = num * num;
        double squareRoot = Math.sqrt(num);

        System.out.println("Square: " + square);
        System.out.println("Square Root: " + squareRoot);

        input.close();
    }
}