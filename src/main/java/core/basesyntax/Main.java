package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder("Boeing 737")
                .setMass(350).setMaxMassTransported(70);
        Plane plane1 = planeBuilder.setMaxHeight(12)
                .setMaxSpeed(950)
                .build();
        Plane plane2 = planeBuilder.setMaxHeight(10)
                .setMaxSpeed(1050)
                .build();

        System.out.println(plane1 + System.lineSeparator() + plane2);
    }

}
