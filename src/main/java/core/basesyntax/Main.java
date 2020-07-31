package core.basesyntax;

public class Main {

    public static void main(String[] args) {
        Plane plane = Plane.builder()
                .setColour("white")
                .setId(67979)
                .setName("Plane")
                .setType("boeing")
                .setYear(2012)
                .build();
    }
}
