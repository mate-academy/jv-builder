package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder builder = new Plane.PlaneBuilder();
        Plane plane1 = builder.setPlaneModel("Boeing 737-900")
                .setEnginePower(1000)
                .setPlaneSpeed(852)
                .setPlaneWeight(42901)
                .setPlaneClassification("Passenger")
                .build();
    }
}
