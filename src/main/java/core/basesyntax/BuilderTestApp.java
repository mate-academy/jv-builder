package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setModel("AN-51")
                .setColor("White")
                .setYear(2000)
                .setLength(20)
                .setMission("Charter")
                .build();
        System.out.println(plane.toString());
    }
}
