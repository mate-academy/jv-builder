package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setColor("red").setModel("boeing").setCompany("MAU")
                .setYear(1999).setSeatPassengers(201).build();
        System.out.println(plane);
    }
}
