package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setPlaneType("Boing 747")
                .setNumberOfPassengers(150).setWhichAirlines("WithAir")
                .setYearOfProduction("2006").setCode(1241251515)
                .build();
        System.out.println(plane.toString());
    }
}
