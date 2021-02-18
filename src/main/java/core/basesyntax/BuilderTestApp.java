package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane firstPlane = new Plane.PlaneBuilder()
                .setOwner("Tania")
                .setSeats(4)
                .setMass(250)
                .setModel("CTV")
                .build();
        System.out.println(firstPlane.toString());
    }
}
