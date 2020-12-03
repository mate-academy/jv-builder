package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setColor("red").setFlightRange(1000)
                .setMaxSpeed(1500).setModel("AN-700").setPassengerCapacity(90).build();
        System.out.println(plane);
    }
}
