package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane passengersPlane = new Plane.PlaneBuilder()
                .setBrand("Boeing")
                .setModel("777")
                .setTakeOffWeightTon(300)
                .setPassengersCapacity(400)
                .setCrewCount(2)
                .build();

        Plane militaryCargoPlane = new Plane.PlaneBuilder()
                .setBrand("Lockheed")
                .setModel("C-130 Hercules")
                .setTakeOffWeightTon(84)
                .setPassengersCapacity(72)
                .setCrewCount(2)
                .build();

        System.out.printf("Passengers plane is %s\n", passengersPlane.toString());
        System.out.printf("Military cargo plane is %s\n", militaryCargoPlane.toString());
    }
}
