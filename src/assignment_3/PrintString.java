package assignment_3;

public class PrintString {
    public static void main(String[] args) {
        String name = "SuperB";
        int age = 100;
        String template = String.format("Hi, I am %s, and I am %s years old.", name, age);
        System.out.println(template);
    }
}