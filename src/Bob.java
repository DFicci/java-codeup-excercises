import java.util.Scanner;

public class Bob {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("let's talk to bob");

        String userInput = sc.nextLine().trim();

        System.out.println(userInput);

        if (userInput.endsWith("?")){
            System.out.println("sure");
        } else if (userInput.endsWith("!")){
            System.out.println("Whoa, Chill out!");
        } else if (userInput.equals("")){
            System.out.println("Fine. be that way.");
        } else {
            System.out.println("Whatever.");
        }
    }
}
