import java.util.Scanner;

public class Assignment2_1 {
    public static void main(String[] args) {
        System.out.println("This program converts a temperature in degrees" 
            + " Celsius into a temperautre in degrees Fahrenheit.");

        // get input temperature
        System.out.println("Please input a temperature in degrees Celsius:");
        Scanner input = new Scanner(System.in);
        double tempInC = input.nextDouble();
        input.close();

        // convert and display results
        double tempInF = ((9.0 / 5.0) * tempInC) + 32;
        System.out.format("%n%.2f degrees Celsius is equal to %.2f degrees " 
            + "Fahrenheit.%n%nGoodbye...%n", tempInC, tempInF);
    }
}