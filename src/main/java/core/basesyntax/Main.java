package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        Plane airbus = planeBuilder.setName("airbus")
                .setEngines(3)
                .setSeats(130)
                .setWheels(14)
                .setWings(2)
                .setWindows(150)
                .build();
        System.out.println(airbus);
    }
}
