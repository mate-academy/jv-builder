package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        planeBuilder.setName("Boing")
                .setMaxSpeed(800)
                .setType("Airliner")
                .setRangeOfFlight(10000)
                .setPassengerCapacity(200)
                .build();
    }
}
