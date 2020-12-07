package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setModel("Airbus A320").setName("MAU")
                .setHorsePower(25_000).setSeats(150).setYear(1987).build();
        System.out.println(plane.toString());
    }
}
