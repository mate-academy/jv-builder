package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane planeBoeing = new Plane.PlaneBuilder().setName("Boeing-737")
                .setAmountSeats(114).setAmountTurbine(4)
                .setCruisingSpeed(793)
                .setLiftingCapacity(52800).build();
        System.out.println(planeBoeing.toString());
    }
}
