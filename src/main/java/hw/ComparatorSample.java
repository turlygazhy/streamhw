package hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Henry", 30), new Person("Alice", 41), new Person("Zoid", 126));

        Comparator<Person> compareByAge = (p1, p2) -> p1.getAge() - p2.getAge();
        Comparator<Person> compareByName = (p1, p2) -> p1.getName().compareTo(p2.getName());

        people.forEach(System.out::println);

        people.sort(compareByAge);
        people.forEach(System.out::println);

        people.sort(compareByName);
        people.forEach(System.out::println);
    }
}
