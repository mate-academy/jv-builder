package core.basesyntax;

public class AppMainPlane {
    public static void main(String[] args) {
        Plane.PlaneBuilder redPlane = new Plane.PlaneBuilder()
                .setName("Shelby")
                .setColor("red").setWeight(1474);
        Plane rxShelby = redPlane.setModel("GT-350").setSpeed(231).build();
        Plane asShelby = redPlane.setModel("AS").setSpeed(600).build();
        Plane forrestShelby = redPlane.setModel("FR-RT").setSpeed(9999).build();
        System.out.println(rxShelby);
        System.out.println(asShelby);
        System.out.println(forrestShelby);
    }
}
