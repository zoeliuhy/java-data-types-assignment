package assignment_for_if_4;

public class Loop {
    public static void main(String[] args) {
        printPyramid(5);
    }

    private static void printPyramid(int size) {
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("+");
            }
            System.out.println(" ");
        }
    }
}
