package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Plane tupolev = new Plane.PlaneBuilder().setModel("TU-134")
                .setColour("white").setMaxSpeed(850)
                .setSize("37 meters").setType("passenger plane").build();
        Plane.PlaneBuilder cargoPlane = new Plane.PlaneBuilder()
                .setType("Cargo plane").setColour("white");
        Plane mria = cargoPlane.setColour("white").setMaxSpeed(850)
                .setModel("AH-225").setSize("84 meters").build();
        System.out.println(tupolev + "\n");
        System.out.println(mria);
    }
}
