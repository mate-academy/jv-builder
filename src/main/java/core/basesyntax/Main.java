package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        Plane myPlane = planeBuilder.setId(1)
                .setModel("Broiler 747")
                .setNumberOfPassenger(13)
                .setIsSeaplane(true)
                .setColour("Pink")
                .build();
        System.out.println(myPlane);
    }
}
