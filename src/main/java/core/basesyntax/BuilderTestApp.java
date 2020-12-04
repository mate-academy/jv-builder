package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane firstPlane = new Plane.PlaneBuilder()
                .setModel("Yak 40")
                .setCapacity(4)
                .setType("Passenger")
                .setYear(2010)
                .setRange(200)
                .build();

        System.out.println(firstPlane.toString());
    }
}
