package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane su25 = new Plane.PlaneBuilder().setEnginePower(4100).setEngineType("R-95SH")
                .setPlaneType("Military").setMaxSpeed(950).setMaxHeight(16000).build();
        System.out.println(su25.getInformation());
    }
}
