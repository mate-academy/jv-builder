package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane redPlane = new Plane.PlaneBuilder()
                .setModel("passenger's")
                .setMaxSpeed(1000)
                .setColor("white")
                .setWings(true)
                .setAirframe(true)
                .setPropeller(true)
                .build();
        System.out.println(redPlane.toString());
    }
}
