package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane firstPlane = new Plane.Builder()
                .setColor("Gray")
                .setDoors(4)
                .setSits(64)
                .setSize("Big")
                .build();

        Plane secondPlane = new Plane.Builder()
                  .setDoors(6)
                  .setCargo(true)
                  .build();

        System.out.println(firstPlane.toString());
        System.out.println(secondPlane.toString());
    }
}
