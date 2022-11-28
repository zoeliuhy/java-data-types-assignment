package assignment_for_it_1;

public class Door {
    double width;
    double height;
    boolean open;

    public Door (double width, double height, boolean open) {
        this.width = width;
        this.height = height;
        this.open = open;
    }

    public void openDoor() {
        if (!open) {
            open = true;
            System.out.println("Opening door");
        } else {
            System.out.println("The door is already opened.");
        }
    }

    public void closeDoor() {
        if (open) {
            open = false;
            System.out.println("Closing door");
        } else {
            System.out.println("The door is already closed.");
        }
    }

    public void printOpen() {
        if (open) {
            System.out.println("The door is open.");
        } else {
            System.out.println("The door is closed.");
        }
    }

    public double calculateSurface() {
        return width * height;
    }
}
