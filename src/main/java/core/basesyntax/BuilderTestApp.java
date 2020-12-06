package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {

        Plane boeing747 = new Plane.PlaneBuilder()
                .setModel("Boeing 747")
                .setCompany("UIA")
                .setYear(2015)
                .setCapacity(70)
                .setColour("blue and yellow")
                .build();

        System.out.println(boeing747.toString());
    }
}
