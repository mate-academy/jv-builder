package core.basesyntax;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        Plane.PlaneBuilder plane = new Plane.PlaneBuilder()
                .setPlaneID(12)
                .setPlaneName("An")
                .setGasCapacity(1500)
                .setIsInAir(false)
                .setPilotName("Vasia")
                .build();
    }
}
