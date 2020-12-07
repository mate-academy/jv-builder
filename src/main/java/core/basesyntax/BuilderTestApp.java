package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane firstPlane = new Plane.PlaneBuilder()
                .setName("Boeing")
                .setModel("737-800")
                .setColour("Green")
                .setYear(1996)
                .setPassengerCapacity(198)
                .build();

        Plane secondPlane = new Plane.PlaneBuilder()
                .setName("Airbus")
                .setModel("a380")
                .setColour("White")
                .setPassengerCapacity(150)
                .setYear(2002)
                .build();

        System.out.println(firstPlane);
        System.out.println(secondPlane);
    }
}
