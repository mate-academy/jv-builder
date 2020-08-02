package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder kukuruznik = new Plane.PlaneBuilder()
                .setModel("K-100")
                .setColor("green")
                .setMaxSpeed(60.0)
                .setWeight(400)
                .setPrice(9999.99)
                .build();
    }
}
