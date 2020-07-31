package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        //Test Plane
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder("Boing");
        Plane airbus = planeBuilder.setEngines(3)
                .setSeats(130)
                .setWheels(14)
                .setWings(2)
                .setWindows(150)
                .build();
        System.out.println(airbus.toString());
    }
}
