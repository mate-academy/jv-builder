package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Plane.PlaneBuilder pb = new Plane.PlaneBuilder("MIG");
        Plane plane = pb.build();
    }
}
