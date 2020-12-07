package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder(true, true, true)
                .setModel("passenger's")
                .setMaxSpeed(1000)
                .setColor("white")
                .build();
        System.out.println(plane);
    }
}
