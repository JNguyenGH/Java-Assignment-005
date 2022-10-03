import java.util.Scanner;

public class TempConversion {
    static final Scanner input = new Scanner(System.in);

    public static double convertC2F(double celsius) {
        return (celsius * (9.0/5)) + 32.0;
    }

    public static double convertC2K(double celsius) {
        return celsius + 273.15;
    }

    public static double convertF2C(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

    public static double convertF2K(double fahrenheit) {
        return convertC2K(convertF2C(fahrenheit));
    }

    public static double convertK2C(double kelvin) {
        return kelvin - 273.15;
    }
public static double convertK2F (double kelvin) {
        return convertC2F(convertK2F(kelvin));
}
    public static double getTemp() {
        System.out.printf("%-40s : ", String.format("Please enter °%s temperature to convert", unit));
        return Double.parseDouble(input.nextLine());
    }

    public static String getUnitChoice() {
        System.out.printf("%-4s : %40s%n", "C).", "To convert a °C temperature");
        System.out.printf("%-4s : %40s%n", "F).", "To convert a °F temperature");
        System.out.printf("%-4s : %40s%n", "K).", "To convert a °K temperature");
        System.out.printf("%-4s : %40s%n", "Q).", "To quit");
        return input.nextLine();
    }

    public static void main(String[] args) {
        String from;
        while (true) {
            System.out.println("Enter a temperature unit to convert from:");
            from = getUnitChoice();
            if (from.equals("Q") || from.equals("q")) {
                break;
                double fromValue = getTemp();
                double to = 0.0;
            }
        }
        System.out.println("Enter a temperature unit to convert to:");
        String to = getUnitChoice();
        if (to.equals("Q") || to.equals("q")) {
            break;
        }
        System.out.println("Enter a double temperature value to convert:");
        double convert = getTemp();
        switch (from + to) {
            case "K":
                switch (to) {
                    case "F" -> {
                        to = convertK2F(from);
                        System.out.println("K to F");
                    }
                    case "C" -> {
                        to = convertK2C(from);
                        System.out.println("K to C");
                    }
                }
                break;
            case "C":
                switch (to) {
                    case "F"->{
                        to = convertC2F(from);
                        System.out.println("C to F");
                    }
                    case "K"-> {
                        to = convertC2K(from);
                        System.out.println("C to K");
                    }
                }
            case "F":
                switch (to) {
                    case "C"-> {
                        to = convertK2C(from);
                        System.out.println("F to C");
                    }
                    case "K"->{
                        to = convertF2K(from);
                        System.out.println("F to K");
                    }
                }

        }
        System.out.println("Result 40.000000°C is 104.000000°F");}
}