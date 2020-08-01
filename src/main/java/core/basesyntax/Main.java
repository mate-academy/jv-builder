package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setName("Boeing")
                .setCapacity(450)
                .setFlightRange(950)
                .setPower(1000)
                .setWingspan(60)
                .build();
    }

}
