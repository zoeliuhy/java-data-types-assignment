package assignment_airport;

public class Airplane {

    private String identification;
    private int passengerMaxNum = 53;
    private int passengerCurrentNum;
    private boolean isFlying;
    private int cruiseSpeed;

    public Airplane ( String identification, int passengerCurrentNum, boolean isFlying, int cruiseSpeed ) {
        this.identification = identification;
        this.passengerCurrentNum = passengerCurrentNum;
        this.isFlying = isFlying;
        this.cruiseSpeed = cruiseSpeed;
    }

    public String loadPassenger(int passengers) {
        if (this.passengerCurrentNum + passengers > this.passengerMaxNum || this.isFlying) {
            return "The airplane is too crowded, unable to load more passengers.";
        } else {
            passengerCurrentNum += passengers;
            return "Airplane %s loads %d passengers.".formatted(this.identification, passengers);
        }
    }

    public String unLoadPassenger(int passengers) {
        if (this.passengerCurrentNum < 0 || this.isFlying) {
            return "The airplane is unable to unload passengers.";
        } else {
            passengerCurrentNum -= passengers;
            return "Airplane %s unloads %d passengers.".formatted(this.identification, passengers);
        }
    }

    public String flightTakeOff() {
        if (!this.isFlying) {
            this.isFlying = true;
            return "Airplane %s takes off.".formatted(this.identification);
        } else {
            return "The fight is on the sky already.";
        }
    }

    public String flightLands() {
        if (this.isFlying) {
            this.isFlying = false;
            return "Plane %s lands.".formatted(this.identification);
        } else {
            return "The fight is on the land already.";
        }
    }

}
