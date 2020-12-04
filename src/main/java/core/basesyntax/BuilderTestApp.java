package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane bestPlane = new Plane.PlaneBuilder().setType("military")
                .setModel("f-16").setYear(2010).setSpeed(1234)
                .setChassis("Chassis").setFuselage("full")
                .build();

        Plane voyager = new Plane.PlaneBuilder().setType("passanger")
                .setModel("Boeing").setYear(2007).setSpeed(500)
                .setChassis("chassis").setFuselage("Fuselage")
                .build();
        System.out.println(bestPlane.toString());
        System.out.println(voyager.toString());
    }
}
