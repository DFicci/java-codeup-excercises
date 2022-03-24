package util;

import java.util.Scanner;

public class Input {
    private Scanner input;

    public Input() {
        input = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.printf("%s", prompt);
        return input.nextLine();
    }

    public boolean yesNo(String prompt) {
        System.out.printf("%s", prompt);
        String response = input.nextLine();
        if(response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("y")) {
            return true;
        }
        return false;
    }

    public int getInt(String prompt, int min, int max) {
        while(true) {
            int result = getInt(prompt);
            if(result >= min && result <= max) {
                return result;
            }
            System.out.printf("Integer must be between %d and %d!\n", min, max);
        }
    }

    public double getDouble(String prompt, double min, double max) {
        while(true) {
            double result = getDouble(prompt);
            if(result >= min && result <= max) {
                return result;
            }
            System.out.printf("Double must be between %f and %f!\n", min, max);
        }
    }

    public int getInt(String prompt) {
        while(true) {
            System.out.printf("%s", prompt);
            if(input.hasNextInt()) {
                int result = input.nextInt();
                input.nextLine();
                return result;
            }
            input.nextLine();
        }
    }

    public double getDouble(String prompt) {
        while(true) {
            try {
                String aString = getString(prompt);
                return Double.valueOf(aString);
            } catch(NumberFormatException e) {
                System.out.println("Input something that can be turned into a double.");
            }
        }
    }

    public void close() {
        input.close();
    }
}
