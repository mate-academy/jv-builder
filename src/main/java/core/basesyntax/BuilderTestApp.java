package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {

        Plane.PlaneBuilder boeingSevenFourSeven = new Plane.PlaneBuilder()
                .setName("Boeing")
                .setModel("747");

        Plane boeing = boeingSevenFourSeven
                .setYearBuild(2010)
                .setEngineHorsePower(5000)
                .setPassengersCapacity(500)
                .build();
    }
}
