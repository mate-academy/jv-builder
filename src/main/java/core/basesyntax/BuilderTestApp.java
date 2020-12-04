package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {

        Plane plane = new Plane.PlaneBuilder().setLength(10)
                .setName("A380")
                .build();
        Plane.PlaneBuilder boeingPlane = new Plane.PlaneBuilder()
                .setName("Boeing")
                .setWork(false)
                .setLengthWings(0)
                .setLength(0)
                .setPropulsion("legs");
        Plane boeing000 = boeingPlane.build();
        Plane boeing777 = boeingPlane.setName("777")
                .setPropulsion("Ramjet")
                .setWork(true)
                .setLengthWings(6.090)
                .setLength(7.390)
                .build();
        System.out.println(plane.toString());
        System.out.println(boeingPlane.toString());
        System.out.println(boeing777.toString());
        System.out.println(boeing000.toString());
    }
}
