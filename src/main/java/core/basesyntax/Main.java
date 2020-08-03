package core.basesyntax;

public class Main {
    public static void main(String[] args) {

        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        planeBuilder.setCountOfSeats(330);
        planeBuilder.setColor("white");
        planeBuilder.setModel("boieng");
        Plane plane = planeBuilder.build();
    }
}
