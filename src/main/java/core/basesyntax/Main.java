package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        Plane plane = planeBuilder.setMark("Bowing")
                .setNumOfEngine(4)
                .setEngineType("Fuel")
                .setPower("2000")
                .setType("Business")
                .build();
        System.out.println(plane);
    }
}
