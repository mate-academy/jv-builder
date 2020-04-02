package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder builder = new Plane.PlaneBuilder();

        Plane plane1 = builder.setType("Passenger").setProducer("Boeing")
                .setModel("boeing-707").setProductionYear(1970)
                .setSeatsNumber(290).build();

        Plane plane2 = builder.setModel("boeing-314").setProductionYear(1939)
                .setSeatsNumber(74).build();

        printPlainInfo(plane1);
        printPlainInfo(plane2);
    }

    private static void printPlainInfo(Plane plane) {
        System.out.println(plane.getType() + " plain, " + plane.getProducer()
                + ", " + plane.getModel() + ", " + plane.getProductionYear() + ", year "
                + plane.getSeatsNumber() + "seats");
    }
}
