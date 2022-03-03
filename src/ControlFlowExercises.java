import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        for (int integer = 5; integer <= 15; integer++){
//            System.out.println(integer + " ");
//        }
//
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }
//
//        long number = 2;
//
//        do {
//            System.out.println(number);
//            number *= number;
//        } while (number < 1000000L);
//
//        for (int i = 1; i <=100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
//
//        boolean userContinues = true;
//
//        do {
//            System.out.println("What number would you like to go up to?");
//            int userInt = scanner.nextInt();
//            System.out.println();
//            System.out.println("Here is your table: ");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userInt; i++) {
//                System.out.print(i);
//                System.out.print(" | ");
//                System.out.print(i*i);
//                System.out.print(" | ");
//                System.out.print(i*i*i);
//                System.out.println();
//            }
//            System.out.print("Would you like to continue? [y/n] ");
//            String userResponse = scanner.next();
//            if(!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        } while (userContinues);

        System.out.println("Enter a grade 0 - 100: ");
        String userInput = scanner.nextLine();
        int inputGrade = Integer.parseInt(userInput);
        System.out.println("would you like to continue? please type: [y for yes and n for no]");
        String goForward = scanner.nextLine();
        if (goForward.equals("y")) {
            if (inputGrade >= 0 && inputGrade <= 64) {
                System.out.println("You fail the course");
            } else if (inputGrade >= 65 && inputGrade <= 66) {
                System.out.println("Your grade is: D");
            } else if (inputGrade >= 67 && inputGrade <= 69) {
                System.out.println("Your grade is: D+");
            } else if (inputGrade >= 70 && inputGrade <= 72) {
                System.out.println("Your grade is: C-");
            } else if (inputGrade >= 70 && inputGrade <= 76) {
                System.out.println("Your grade is: C");
            } else if (inputGrade >= 77 && inputGrade <= 79) {
                System.out.println("Your grade is: C+");
            } else if (inputGrade >= 80 && inputGrade <= 82) {
                System.out.println("Your grade is: B-");
            } else if (inputGrade >= 83 && inputGrade <= 86) {
                System.out.println("Your grade is: B");
            } else if (inputGrade >= 87 && inputGrade <= 89) {
                System.out.println("Your grade is: B+");
            } else if (inputGrade >= 90 && inputGrade <= 92) {
                System.out.println("Your grade is: A-");
            } else if (inputGrade >= 93 && inputGrade <= 96) {
                System.out.println("Your grade is: A");
            } else if (inputGrade >= 96 && inputGrade <= 100) {
                System.out.println("Your grade is: A+");
            } else {
                System.out.println("Sorry, in order to see your letter grade you would have to say yes.");
            }
        }
    }
}
