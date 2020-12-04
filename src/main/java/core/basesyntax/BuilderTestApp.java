package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane boeing747 = new Plane.PlaneBuilder().setModel("Boeing 747")
                .setColor("Red with white stripes").setYear(1990)
                .setPassengersCapacity(452).setEngineThrust(22.6).build();
        System.out.println(boeing747.toString());
    }
}
