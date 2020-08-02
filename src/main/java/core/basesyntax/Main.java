package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setLength(37.6).setHeight(11.8).setMaximumSpeed(890)
                .setBrand("Airbus").setModel("A320").setEmptyWeight(42100).build();
        System.out.println(plane);
    }
}
