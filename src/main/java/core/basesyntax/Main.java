package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setColor("Red")
                .setMaxSpeed(800)
                .setModel("Boeing")
                .setPassengerCapacity(350)
                .setWeight(25000)
                .build();
        System.out.println(plane);
    }
}
