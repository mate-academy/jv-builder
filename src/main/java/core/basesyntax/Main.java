package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        Plane boing747 = planeBuilder.setBrand("Boing").setName("747")
                .setCapacity(100).setSize(50).setAge(8).build();
        Plane boing777 = planeBuilder.setName("777").build();
        System.out.println(boing747.toString());
        System.out.println(boing777.toString());
    }
}
