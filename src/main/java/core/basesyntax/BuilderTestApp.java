package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane.PlaneBuilder ruslan1999 = new Plane.PlaneBuilder()
                .setModel("Antonov An-124 Ruslan")
                .setYear(1999);

        Plane firstPlane = ruslan1999.setCrewSize(9)
                .setPeopleCapacity(100)
                .setWeightCapacity(40)
                .setWeight(500)
                .build();

        Plane secondPlane = ruslan1999.setCrewSize(12)
                .setPeopleCapacity(0)
                .setWeightCapacity(300)
                .setWeight(600)
                .build();

        System.out.println(firstPlane.toString());
        System.out.println(secondPlane.toString());
    }
}
