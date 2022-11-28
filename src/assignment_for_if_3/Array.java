package assignment_for_if_3;

public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.println("forEachLoop");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("regularForLoop");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] = i + 1);
        }
    }
}
