package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setColour("red")
                .setMaxSpeed(800)
                .setBrand("Boeing")
                .setPassengersCount(300)
                .setWeight(700)
                .build();
    }
}
