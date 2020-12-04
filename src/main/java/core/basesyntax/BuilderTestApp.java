package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setCompany("Boeing").setName("B-737")
                .setLength(50).setSeats(150).setYear(2020).build();
        System.out.println(plane.toString());
    }
}
