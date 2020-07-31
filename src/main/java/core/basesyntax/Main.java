package core.basesyntax;

public class Main {
    Plane.PlaneBuilder plane = new Plane.PlaneBuilder()
            .setPlaneID(12)
            .setPlaneName("An")
            .setGasCapacity(1500)
            .setIsInAir(false)
            .setPilotName("Vasia")
            .build();
}
