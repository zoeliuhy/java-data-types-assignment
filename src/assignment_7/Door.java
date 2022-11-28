package assignment_7;

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
        }
    }

    public void closeDoor() {
        if (open) {
            open = false;
            System.out.println("Closing door");
        }
    }

    public void printOpen() {
        System.out.println("The door is open: " + open);
    }

    public double calculateSurface() {
        return width * height;
    }
}
