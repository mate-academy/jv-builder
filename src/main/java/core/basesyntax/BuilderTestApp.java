package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setColor("red").setModel("boeing").build();
        System.out.println(plane.toString());
    }
}
