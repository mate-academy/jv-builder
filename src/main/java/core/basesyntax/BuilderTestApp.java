package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane boeing737 = new Plane.PlaneBuilder().setName("Boeing 737 max200")
                .setNumberOfEngines(2).setRange(7250).setYear(2018)
                .setNumberOfPassengers(150).build();
        System.out.println(boeing737.toString());

        Plane airbusA319neo = new Plane.PlaneBuilder().setName("Airbus A319neo")
                .setNumberOfEngines(2).setNumberOfPassengers(136).build();
        System.out.println(airbusA319neo.toString());
    }
}
