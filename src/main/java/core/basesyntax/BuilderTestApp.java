package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane boeing = new Plane.PlaneBuilder().setModel("Boeing")
                .setCapacity(500)
                .setType("Reactive")
                .setMaxHeight(10000)
                .setMaxSpeed(600)
                .build();
        System.out.println(boeing.toString());
    }
}
