package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane myPlane = new Plane.PlaneBuilder().setName("Dream").setModel("AH-2")
                .setColor("Red").setSpeed(500).setCapacity(12).build();
        System.out.println(myPlane.toString());
    }
}
