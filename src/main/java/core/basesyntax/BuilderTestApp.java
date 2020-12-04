package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder().setModel("ff").setColor("red")
                .setYear(2013).setPassengerCapacity(300).setPower(10000).build();
        System.out.println(plane);
    }
}
