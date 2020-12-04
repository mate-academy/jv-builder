package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane myPlane = new Plane.PlaneBuilder().setModel("AH-225")
                .setName("Dream").setMaxHeigthFly(10000)
                .setMaxSpeed(850).setCountPassagers(70).build();
        System.out.println(myPlane.toString());
    }
}
