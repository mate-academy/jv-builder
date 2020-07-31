package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setWeight(50)
                .setType("Boeing")
                .setSpeed(1000)
                .setLength(100)
                .setBrand("747")
                .build();
    }
}
