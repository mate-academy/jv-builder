package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder("Dream");
        Plane dream = planeBuilder.setCapacity(1000)
                .setColor("Red")
                .setGuarantee("y")
                .setYearOfBuilding(2020)
                .build();
    }
}
