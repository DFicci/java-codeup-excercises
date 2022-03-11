import java.util.Arrays;


public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];
        people[0] = new Person("Wesley");
        people[1] = new Person("Daniel");
        people[2] = new Person("Emilio");


        for (int i = 0; i < people.length; i++) {
            System.out.println("People who are already in the data base: " + people[i].getName());
        }

        people = addPerson(people, new Person("Raymond"));

        for (Person person : people) {
            System.out.println("adding one more to the list: " + person.getName());
        }
    }


    public static Person[] addPerson(Person[] people, Person person) {
        Person[] addPerson = Arrays.copyOf(people, 4);
        addPerson[addPerson.length - 1] = person;

        return addPerson;
    }
}

