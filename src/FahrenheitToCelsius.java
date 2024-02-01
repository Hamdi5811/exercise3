import java.util.Scanner;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            if (fahrenheit < -460) {
                System.out.println("Temperature must be greater than or equal to -460 degrees Fahrenheit.");
                break;
            }

            double celsius = convertFahrenheitToCelsius(fahrenheit);
            System.out.println("The temperature in Celsius is: " + celsius + " degrees Celsius.");
        }

        scanner.close();
    }

    public static double convertFahrenheitToCelsius(double i) {
        return 5 * (i - 32) / 9;
    }
}