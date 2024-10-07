package tmsl.shirsak;

import java.util.*;

class TemperatureChange {
    float temperature;
    int choice;

    public static void main(String args[]) {
        TemperatureChange ob = new TemperatureChange();
        ob.input_temperature();
        ob.input_choice();
        ob.calculate();
    }

    public void input_temperature() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        temperature = sc.nextFloat();
        sc.close();
    }

    public void input_choice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: \n1. Convert from Celsius to Fahrenheit: \n2. Convert from Fahrenheit to Celsius:\n");
        choice = sc.nextInt();
        sc.close();
    }

    public void calculate() {
        float result;
        switch (choice) {
            case 1:
                result = (temperature * 9 / 5) + 32;
                System.out.println(temperature + "°C = " + result + "°F");
                break;
            case 2:
                result = (temperature - 32) * 5 / 9;
                System.out.println(temperature + "°C = " + result + "°F");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}