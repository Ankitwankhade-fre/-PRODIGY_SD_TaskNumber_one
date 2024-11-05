import java.util.Scanner;

public class TemperatureConverter {
    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5/9 + 273.15;
    }

    // Convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9/5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature value: ");
        double value = scanner.nextDouble();

        System.out.println("Enter original unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        switch (unit) {
            case 'C':
                System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(value) + " °F");
                System.out.println("Temperature in Kelvin: " + celsiusToKelvin(value) + " K");
                break;
            case 'F':
                System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(value) + " °C");
                System.out.println("Temperature in Kelvin: " + fahrenheitToKelvin(value) + " K");
                break;
            case 'K':
                System.out.println("Temperature in Celsius: " + kelvinToCelsius(value) + " °C");
                System.out.println("Temperature in Fahrenheit: " + kelvinToFahrenheit(value) + " °F");
                break;
            default:
                System.out.println("Invalid unit entered.");
        }

        scanner.close();
    }
}
