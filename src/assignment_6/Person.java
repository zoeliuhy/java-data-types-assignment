package assignment_6;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public String printIntroduction() {
        return "Hi, my name is %s and I am %d years old.".formatted(name, age);
    }
}
