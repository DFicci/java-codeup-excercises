import java.util.Arrays;


public class ArraysExercises {
    public static void main(String[] Args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        people[0] = new Person("John");
        people[1] = new Person("Jane");
        people[2] = new Person("Doe");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }

       people = addPerson(people, new Person("Daniel"));

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    }

    public static Person[] addPerson(Person[] people, Person person){
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[newArray.length - 1] = person;
        return newArray;
    }

}

