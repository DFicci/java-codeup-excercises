import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;

        System.out.printf("The value of pi is approximately %.2f", pi);
        System.out.println(" ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int input = scanner.nextInt();
        System.out.println("Your integer is: " + input);
        System.out.println("");

        System.out.println("Enter three words");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();
        System.out.println("");
        System.out.printf("Your words are: %s %s %s", firstWord, secondWord, thirdWord);
        System.out.println("");

        System.out.println("");
        System.out.println("write a sentence!");
        String sentence = scanner.next();
        String userSentence = scanner.nextLine();
        System.out.println("Your sentence is: " + sentence + userSentence);
        System.out.println("");

        System.out.println("Enter a width");
        String w = scanner.nextLine();
        float x = Float.parseFloat(w);
        System.out.println("Enter a length");
        String length = scanner.nextLine();
        float y = Float.parseFloat(length);
        System.out.println("");

        System.out.println("The area of the room is: " + (x * y));
        System.out.println("The perimeter of the room is: " + ((x * 2) + (y * 2)));

    }

}
