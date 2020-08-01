package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane myPlane = new Plane.PlaneBuilder()
                .withColour("blue")
                .withId(543)
                .withOwner("Marsel")
                .withNumberOfFlights(165)
                .withModel("ad123")
                .build();
    }
}
