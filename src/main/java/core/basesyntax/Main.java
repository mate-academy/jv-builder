package core.basesyntax;

public class Main {
    public static void main(String [] args) {
        Plane planeToCyprus = new Plane.PlaneBuilder()
                .setAirLines("Ukrainian International Airlines")
                .setBrand("Boeing 767-300")
                .setColor("white")
                .setSpeed(852)
                .setYearOfIssue(2004)
                .build();
    }
}
