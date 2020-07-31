package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        Plane plane = planeBuilder.setFlightCeiling(100).build();
        planeBuilder.setFlightCeiling(200);
        Plane plane2 = planeBuilder.setManufacturingCompany("Boeing")
                .setIsMilitary(true).build();

        System.out.println(plane.getFlightCeiling());
        System.out.println(plane2.getFlightCeiling() + " "
                + plane2.getManufacturingCompany() + " " + plane2.getIsMilitary());
    }
}
