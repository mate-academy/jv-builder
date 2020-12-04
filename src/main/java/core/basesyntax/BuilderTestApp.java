package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        System.out.println(new Plane.PlaneBuilder().setIsAirliner(false).setName("AirBus")
                .setModel("A320").setEnginePower(3000).setNumberOfEngines(4).setNumberOfSits(60)
                .build());
    }
}
