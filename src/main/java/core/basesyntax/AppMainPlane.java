package core.basesyntax;

public class AppMainPlane {
    public static void main(String[] args) {
        Plane.PlaneBuilder redPlaneBuilder = new Plane.PlaneBuilder("shelby")
                .setColor("red")
                .setWeight(1474);
        Plane rxShelby = redPlaneBuilder.setModel("GT-350")
                .setSpeed(231).setColor("red")
                .build();
        Plane asShelby = redPlaneBuilder.setModel("AS")
                .setSpeed(600).build();
        Plane forrestShelby = redPlaneBuilder.setModel("FR-RT")
                .setSpeed(9999).build();
        System.out.println(rxShelby);
        System.out.println(asShelby);
        System.out.println(forrestShelby);
    }
}
