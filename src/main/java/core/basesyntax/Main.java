package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder pb = new Plane.PlaneBuilder();
        pb.setModel("new").setWeight(10000).setDestination("People")
                .setEngineQuantity(4).setSpeedType("light").setWingsQuantity(8)
                .setYear(2020).build();
    }
}
