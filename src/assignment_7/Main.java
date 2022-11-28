package assignment_7;

public class Main {

    public static void main(String[] args) {

        Door openedDoor = new Door(100, 100.5, true);
        Door closedDoor = new Door (200, 40.6, false);

        openedDoor.openDoor();
        openedDoor.closeDoor();
        openedDoor.printOpen();
        System.out.println("The surface of the door is: " + openedDoor.calculateSurface());

        closedDoor.openDoor();
        closedDoor.closeDoor();
        closedDoor.printOpen();
        System.out.println("The surface of the door is: " + closedDoor.calculateSurface());

    }
}
