package assignment_6;

public class Person {
    public static void main(String[] args) {
        String name = "SuperB";
        String age = "100";
        printIntroduction(name, age);
        name = "SuperA";
        age = "150";
        printIntroduction(name, age);
        name = "SuperC";
        age = "200";
        printIntroduction(name, age);
    }

    public static void printIntroduction(String name, String age) {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
