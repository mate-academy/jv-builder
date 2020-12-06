package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setMaker("Airbus")
                .setModel("A321")
                .setEnginePower(15000)
                .setPassegerCapacity(220)
                .setMaxFlightHigh(5950)
                .build();

        System.out.println(plane.toString());
    }
}
