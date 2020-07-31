package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setBrand("Boing")
                .setModel("737")
                .setCapacity(55)
                .setMaxSpeed(850)
                .setRangeOfFlight(1500)
                .build();
    }
}
