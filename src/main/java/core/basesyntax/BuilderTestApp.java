package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane.PlaneBuilder plane = new Plane.PlaneBuilder().setModel("Boeing737");
        plane = plane.setColor("white");
        plane = plane.setLength(30);
        plane = plane.setWide(28);
        plane = plane.setPrice(90);
        plane.build();

        System.out.println(plane.toString());
    }
}
