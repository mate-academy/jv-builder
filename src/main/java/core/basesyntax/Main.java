package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setColor("Grey")
                .setId(4)
                .setModel("Airbus A220")
                .setSpeed(300)
                .setWeight(500)
                .build();
        System.out.println(plane);
    }
}
