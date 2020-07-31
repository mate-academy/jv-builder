package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setId(1)
                .setName("AN-225 \"Mriya\" ")
                .setProducer("Ukraine")
                .setHeight(18.2).setLength(84)
                .setWingspan(84.2)
                .setCrewCount(6)
                .setWeight(250000)
                .build();
        System.out.println(plane.toString());
    }
}
