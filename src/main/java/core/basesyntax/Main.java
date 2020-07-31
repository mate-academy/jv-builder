package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setModel("Boing").setSpeed(850).setWeight(27000)
                .setCountPassengers(1300).setCountEngine(6).build();
        System.out.println(plane.toString());
    }
}
