package core.basesyntax;

public class Executor {

    public static void main(String[] args) {
        Plane anPlane = new Plane.PlaneBuilder()
                .setModel("AN-225")
                .setFuelCapacity(365)
                .setSpeed(800)
                .setFlyingHeight(11000)
                .setType("Cargo")
                .build();
        Plane.PlaneBuilder destroyer = new Plane.PlaneBuilder()
                .setType("Destroyer")
                .setFuelCapacity(10)
                .setFlyingHeight(10000);
        Plane mig = destroyer.setModel("Mig-29").setSpeed(1100).build();
        Plane raptor = destroyer.setModel("Raptor").setSpeed(1500).build();
    }
}
