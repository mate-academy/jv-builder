package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder(true, true, true)
                .setModel("passenger's")
                .setMaxSpeed(1000)
                .setColor("white")
                .build();
        System.out.println(plane.toString());
        Plane plane1 = new Plane.PlaneBuilder(false, true, true)
                .setColor("green")
                .build();
        System.out.println(plane1.toString());
    }
}
