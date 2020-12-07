package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {
        Plane boeing = new Plane.PlaneBuilder().setColor("pink").setModel("123")
                .setSpeed(500).setNumberOfSeats(75).setYearOfConstruction(2012).build();
    }
}

