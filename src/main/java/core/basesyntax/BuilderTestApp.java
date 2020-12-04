package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setColour("red")
                .setModel("boeing")
                .setYear(1980)
                .setEngineType("jet engine")
                .setUsageType("passanger")
                .build();
        System.out.println(plane.toString());
    }
}
