package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setModel("Boeing")
                .setPilotName("Sofia")
                .setYearBuilt(2011)
                .setMaxNumberOfPassengers(122)
                .setBrokeDownBefore(false)
                .build();
    }
}
