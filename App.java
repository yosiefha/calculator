import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        String operation = getString("What would you like to do?");

        while (operation.equals("add") || operation.equals("subtract") || operation.equals("multiply")
                || operation.equals("divide")) {
            double num1 = getDouble("Please enter  first numbers");
            double num2 = getDouble("Please enter  second numbers");

            switch (operation) {

                case "add":

                    System.out.print(String.format("you want to add %f  and %f ", num1, num2));
                    System.out.println();
                    String res = inputScanner.nextLine();
                    if (res.equals("Y")) {
                        System.out.println("Result : " + Calculator.add(num1, num2));
                        System.out.println();
                        break;

                    } else {
                        break;
                    }

                case "subtract":

                    System.out.print(String.format("you want to subtract %f  and %f ", num1, num2));
                    System.out.println();
                    res = inputScanner.nextLine();
                    if (res.equals("Y")) {
                        System.out.println("Result : " + Calculator.subtract(num1, num2));
                        System.out.println();
                        break;

                    } else {
                        break;
                    }

                case "multiply":

                    System.out.print(String.format("you want to multiply %f  and %f ", num1, num2));
                    System.out.println();
                    res = inputScanner.nextLine();
                    if (res.equals("Y")) {
                        System.out.println("Result : " + Calculator.multiply(num1, num2));
                        System.out.println();

                        break;
                    } else {
                        break;
                    }
                case "divide":

                    System.out.print(String.format("you want to divide %f  and %f ", num1, num2));
                    System.out.println();
                    res = inputScanner.nextLine();
                    if (num2 == 0) {

                        System.out.println("Dividing by Zero is not allowed  choose another number");
                    } else if (res.equals("Y")) {
                        System.out.println("Result : " + Calculator.divide(num1, num2));
                        System.out.println();
                        break;

                    } else {
                        break;
                    }

                default:
                    System.out.print("Goodbye");
                    break;

            }
            operation = getString("What would you like to do?");
        }
        System.out.print("Goodbye");

    }

    private static String getString(String prompt) {
        System.out.println(prompt);
        System.out.println("    add");
        System.out.println("    subtract");
        System.out.println("    multiply");
        System.out.println("    divide");
        System.out.println("    Type any key to quit");

        String name = inputScanner.nextLine();
        return name;

    }

    private static double getDouble(String prompt) {
        // fill in the code5
        System.out.println(prompt);
        double i = Double.parseDouble(inputScanner.nextLine());

        return i;

    }

}