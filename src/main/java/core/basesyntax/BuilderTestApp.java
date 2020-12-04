package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setNameOfCompany("Boeing")
                .setMaxSpeed(850)
                .setYearIssue(2015)
                .setNumberOfSeats(180)
                .setColor("White-Blue")
                .build();
        System.out.println(plane);
    }
}
