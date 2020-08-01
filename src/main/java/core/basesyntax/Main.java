package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setName("ololo")
                .setIdNumber(12)
                .setWheels(20)
                .setTailNumber(1212)
                .setWeight(3333)
                .build();

        System.out.println(plane.toString());
    }
}
