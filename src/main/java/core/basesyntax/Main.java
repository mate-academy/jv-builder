package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder plain = new Plane.PlaneBuilder();
        Plane myPlane = plain.setCapacity(4).build();
    }
}

