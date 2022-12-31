// Java program that describes the user defined exception.
package userDefinedException;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class userDefinedException {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            try {
                Person person = new Person(name, age);
                System.out.println("Person created: " + person.getName() + ", " + person.getAge());
            } catch (InvalidAgeException e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }
        }
    }
}
