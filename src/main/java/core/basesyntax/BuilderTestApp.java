package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {
        Plane tupolev = new Plane.PlaneBuilder()
                .setModel("TY-134")
                .setMaxTakeoffWeight(47000)
                .setFlightRange(2800)
                .setCruisingSpeed(850)
                .setMaxFlightAltitude(11000)
                .build();
        System.out.println(tupolev.toString());
    }
}
