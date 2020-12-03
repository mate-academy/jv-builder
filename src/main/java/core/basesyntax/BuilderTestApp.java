package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane antonov = new Plane.PlaneBuilder().setModel("Mriya").setDecommissioned(false)
                .setHeight(18.1).setLength(84).setYear(1985).build();
        Plane.PlaneBuilder kramerikanAirlines = new Plane.PlaneBuilder().setDecommissioned(true);
        Plane disaster = kramerikanAirlines.setYear(1970).setModel("REDACTED").build();
        System.out.println(antonov.toString());
        System.out.println(disaster.toString());
    }
}
