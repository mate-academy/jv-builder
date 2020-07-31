package core.basesyntax;

public class MainApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setWingspan(88)
                                            .setEmpennageForm("Tailplane mounted")
                                            .setAircraftEngineClass("Reaction engines")
                                            .build();
        System.out.println(plane.getWingspan());
        System.out.println(plane.getEmpennageForm());
        System.out.println(plane.getLandingGearType());
    }
}
