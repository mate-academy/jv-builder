package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        core.basesyntax.Plane.PlaneBuilder builder = new core.basesyntax.Plane.PlaneBuilder();
        Plane plane = builder.setModel("T-1000")
                .setType("Cargo")
                .setColor("Black")
                .setMaxSpeed(1000)
                .setWeapon(false)
                .build();
    }
}
