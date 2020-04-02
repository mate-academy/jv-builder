package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setCapacity(120).setMaxSpeed(500)
                .setModel("Boeing").setNoiseLevel(2).setWeight(1200).build();
    }
}
