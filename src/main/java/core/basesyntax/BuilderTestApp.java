package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane myPlane = new Plane.PlaneBuilder().setPlaneName("Dream").setPlaneModel("AH-2")
                .setPlaneColor("Red").setPlaneSpeed(500).setPlaneCapacity(12).build();
        System.out.println(myPlane.toString());
    }
}
