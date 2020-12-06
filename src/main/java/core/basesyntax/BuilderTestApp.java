package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane f16 = new Plane.PlaneBuilder()
                .setColor("Silver")
                .setModel("F16")
                .setRangeOfFlight(500)
                .setWeight(9207)
                .setYear(1970).build();

        System.out.println(f16.toString());
    }
}
