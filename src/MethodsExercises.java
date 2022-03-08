import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("10 + 5 = " + addition(10, 5));
        System.out.println("5 - 10 = " + subtraction(5, 10));
        System.out.println("2 * 10 = " + multiplication(2, 10));
        System.out.println("10 / 5 = " + divide(10, 5));
        System.out.println("8 % 4 = " + modulus(8, 4));


        System.out.println("Multiply loop = " + multiplierLoop(2, 4));
        System.out.println("Multiply recursion = " + multiplyRec(10, 10));
        getInteger(1, 10);



        while(true) {
            calculateFactorial();
            System.out.println("Would you like to continue? y for yes/ n for no");
            String userYorN = input.nextLine();
            if (userYorN.toLowerCase().equals("n")){
                System.out.println("Thank you for playing, come again!");
                break;
            }
        }
        rollTheDice(input);
    }
//method for addition
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }
//method for subtraction
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }
//method for multiplication
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }
//method for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
//method for modulus
    public static double modulus(double num1, double num2) {
        return num1 / num2;
    }


    public static double multiplierLoop(double num1, double num2) {
        double result = 0;
        for (double i = 0; i < num1; i++) {
            result += num2;
        }

        return result;
    }

    public static double multiplyRec(double num1, double num2) {

        if ((num1 == 0) || (num2 == 0)) {
            return 0;
        }
        return (num1 + multiplyRec(num1, num2 - 1));

    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int userInput = Integer.parseInt(scan.nextLine());

        if (userInput < min || userInput > max) {
            System.out.println("Please enter a number between 1 and 10. Try again!");
            return getInteger(min, max);
        } else {
            System.out.println("You've entered a valid number!");
            return userInput;
        }
    }

    public static long calculateFactorial() {
        int userInput = getInteger(1, 10);
        long result = 1;
        System.out.println("You entered: " + userInput);
        for (int i = userInput; i <= userInput; i--) {
            result *= i;
        }
        return result;
    }


    public static void rollTheDice(Scanner scan) {

        while (true) {
            System.out.println("Enter the number of sides for a pair of dice: ");
            short userInput = Short.parseShort(scan.nextLine());
            int range = userInput - 1 + 1;
            System.out.println("First dice roll = " + ((int)(Math.random() * range) + 1));
            System.out.println("Second dice roll = " + ((int)(Math.random() * range) + 1));

            System.out.println("Roll again? y for yes/ n for no");
            if(scan.nextLine().equalsIgnoreCase("n")) {
                System.out.println("The End!");
                break;
            }
        }


    }
}
