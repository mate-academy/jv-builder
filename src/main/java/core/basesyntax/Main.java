package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane newPlane = new Plane.PlaneBuilder()
                .setModel("ANTONOV-200")
                .setColor("white")
                .setLength(20)
                .setWingsWidth(30)
                .setEnginesCount(4)
                .build();
    }
}
