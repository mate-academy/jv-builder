package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        Plane myPlane = planeBuilder
                .setAmountOfPassenger(150)
                .setModel("254500UA")
                .setType("Boing")
                .setWeight(3800)
                .setMaxSpeed(800)
                .build();
        System.out.println(myPlane);
    }
}
