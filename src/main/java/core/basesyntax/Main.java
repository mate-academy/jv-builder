package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane airbus = new Plane.PlaneBuilder()
                .setBrand("Airbus")
                .setModel("a320")
                .setMaxSpeed(1000)
                .setMaxHeight(11000)
                .setEngineVolume(300.0).build();
    }

}
