package assignment_6;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("SuperA", 100);
        Person person1 = new Person("SuperB", 200);
        Person person2 = new Person("SuperC", 300);
        System.out.println(person.printIntroduction());
        System.out.println(person1.printIntroduction());
        System.out.println(person2.printIntroduction());

    }
}
