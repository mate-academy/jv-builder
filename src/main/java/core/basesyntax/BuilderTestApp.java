package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setModel("Airbus 383")
                .setFlyDistance(1500)
                .setPassengersCapacity(118)
                .setIsIntercontinental(true)
                .setHasBusinessClass(false)
                .build();
        System.out.println(plane.toString());
    }
}
