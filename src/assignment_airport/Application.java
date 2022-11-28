package assignment_airport;

public class Application {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("ABC123",0, false, 10 );
        Airplane airplane2 = new Airplane("DDD888", 0, false, 10);

        System.out.println(airplane1.loadPassenger(43));
        System.out.println(airplane1.flightTakeOff());
        System.out.println(airplane2.loadPassenger(23));
        System.out.println(airplane1.flightLands());
        System.out.println(airplane1.unLoadPassenger(43));
        System.out.println(airplane2.flightTakeOff());
        System.out.println(airplane2.flightLands());
        System.out.println(airplane2.unLoadPassenger(23));

    }
}
