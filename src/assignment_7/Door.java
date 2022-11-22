package assignment_7;

public class Door {
    public static void main(String[] args) {
        double width = 10;
        double height = 10;
        boolean open = false;
        if (open == true) {
            openDoor(open);
        } else {
            closeDoor(open);
        }
        printOpen(open);
        calculateSurface(width, height);
    }

    public static void openDoor(boolean open) {
        open = true;
        System.out.println("Opening door");
    }

    public static void closeDoor(boolean open) {
        open = !open;
        System.out.println("Closing door");
    }

    public static void printOpen(boolean open) {
        System.out.println("The door is open: " + open);
    }

    public static void calculateSurface(double width, double height) {
        double surface = width * height;
        System.out.println("The surface of the door is: " + surface);
    }

}
