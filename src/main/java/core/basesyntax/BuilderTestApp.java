package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane yellowFastPlane = new Plane.PlaneBuilder()
                .setColor("yellow")
                .setEngineVolume(4000)
                .setModel("TY-102")
                .setFirm("Ukraine Air Lines")
                .build();

        System.out.println(yellowFastPlane.toString());
    }
}
