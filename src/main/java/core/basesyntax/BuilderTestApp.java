package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setModel("Boing")
                .setOrigin("Germany")
                .setType("Militart")
                .setMaxHeight(8000.0)
                .setYear(2005)
                .build();
        System.out.println(plane.toString());
    }
}
