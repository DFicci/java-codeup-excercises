package grades;

import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();

        Student daniel = new Student("Daniel");
        daniel.addGrade(getRandomGrade());
        daniel.addGrade(getRandomGrade());
        daniel.addGrade(getRandomGrade());
        daniel.addGrade(getRandomGrade());

        Student lupe = new Student("Lupe");
        lupe.addGrade(getRandomGrade());
        lupe.addGrade(getRandomGrade());
        lupe.addGrade(getRandomGrade());
        lupe.addGrade(getRandomGrade());

        Student kim = new Student("Kim");
        kim.addGrade(getRandomGrade());
        kim.addGrade(getRandomGrade());
        kim.addGrade(getRandomGrade());
        kim.addGrade(getRandomGrade());

        students.put("Dficci", daniel);
        students.put("daDog", lupe);
        students.put("kt123", kim);

        Scanner scanner = new Scanner(System.in);
        Input input = new Input();
        cli(students, scanner, input);


    }

    public static int getRandomGrade() {
        return 50 + (int)(Math.random() * ((100 - 50) + 1));
    }

    public static void cli(HashMap<String, Student> students, Scanner sc, Input input) {

        System.out.println("Welcome!\nHere are the GitHub usernames of our students:");

        boolean anotherStudent = true;

        do {
            printKeys(students);

            System.out.println("What student would you like to see more information on?");
            String userInput = sc.nextLine();

            displayStudentData(students, userInput);

            anotherStudent = input.yesNo("Would you like to see another student? (yes/no)");

            if (!anotherStudent) {
                System.out.println("Good bye!");
            }

        } while(anotherStudent);

    }

    public static void printKeys(HashMap<String, Student> students) {
        for (String key: students.keySet()) {
            System.out.print("|" + key + "|  ");
        }
        System.out.println();
    }

    public static void displayStudentData(HashMap<String, Student> students, String userInput) {
        if (students.containsKey(userInput)) {
            Student currentStudent = students.get(userInput);
            System.out.println("Name: " + currentStudent.getName() + " - GitHub username: " + userInput);
            System.out.println("Current Average: " + currentStudent.getGradeAverage());
        } else {
            System.out.println("Sorry, no student found with the username of " + userInput);
        }
    }
}
