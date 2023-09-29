package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Moha", MALE),
                new Person("Yassine", MALE),
                new Person("Aicha", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Omaima", FEMALE)
        );

        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE,
        FEMALE
    }

}
