package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane boeing737 = new Plane.PlaneBuilder()
                .setModel("Boeing 737")
                .setColor("White blue")
                .setTypePlane("Passenger plane")
                .setNumberOfEngines(2)
                .setYear(2015)
                .build();
    }
}
