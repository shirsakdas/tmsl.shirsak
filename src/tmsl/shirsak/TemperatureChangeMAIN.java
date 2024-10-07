package tmsl.shirsak;

import java.util.*;

class TemperatureChangeMAIN {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int temperature, choice;
        float result;
        System.out.print("Enter the temperature: ");
        temperature = sc.nextInt();
        System.out.print("Enter your choice: \n1. Convert from Celsius to Fahrenheit: \n2. Convert from Fahrenheit to Celsius:\n");
        choice = sc.nextInt();
        sc.close();
        switch (choice) {
            case 1:
                result = (temperature * 9 / 5) + 32;
                System.out.println(temperature + "°C = " + result + "°F");
                break;
            case 2:
                result = (temperature - 32) * 5 / 9;
                System.out.println(temperature + "°F = " + result + "°C");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}