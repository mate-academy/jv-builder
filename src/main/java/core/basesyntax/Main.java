package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane newPlane = new Plane.PlaneBuilder("noname")
                .setModel("ANTONOV-200")
                .setColor("white")
                .setLength(20)
                .setWingsWidth(30)
                .setEnginesCount(4)
                .build();
    }
}
