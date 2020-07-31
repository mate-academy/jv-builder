package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane mriya = new Plane.PlaneBuilder(23L)
                .setName("Mriya")
                .setSpeed(280)
                .build();
        System.out.println(mriya.getName());
    }
}
