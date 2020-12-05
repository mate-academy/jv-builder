package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setModel("Boeing737")
                                  .setColor("white").setLength(30)
                                  .setWide(28).setPrice(90).build();

        System.out.println(plane.toString());
    }
}
