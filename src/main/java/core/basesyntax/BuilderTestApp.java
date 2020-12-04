package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane concretePlane = new Plane.PlaneBuilder()
                .setModel("AN-101")
                .setYear(2015)
                .setType("passenger")
                .setColor("White")
                .setAmountWindows(20)
                .build();
        System.out.println(concretePlane);
    }
}
