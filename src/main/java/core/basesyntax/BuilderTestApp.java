package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane planeUsa = new Plane.PlaneBuilder().setHeight(88)
                .setWeight(7000).setMaxHeight(10000).setModel("IC-130")
                .setMaxSpeed(1500).build();
        Plane planeUa = new Plane.PlaneBuilder().setHeight(15)
                .setWeight(4000).setMaxHeight(15000).setModel("SU-29")
                .setMaxSpeed(2500).build();
        Plane planeRus = new Plane.PlaneBuilder().setHeight(17)
                .setWeight(4000).setMaxHeight(17000).setModel("MIG-54")
                .setMaxSpeed(2400).build();
    }
}
