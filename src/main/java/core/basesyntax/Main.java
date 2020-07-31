package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setBrand("Летучий")
                .setModel("Голландец")
                .setSpeed(100500)
                .setValue(1337)
                .setCountryOfArrival("Ukraine")
                .build();
    }

}
