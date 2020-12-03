package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {
        Plane firstTestPlane = new Plane.PlaneBuilder()
                .setModel("Spitfire")
                .setCompany("Supermarine")
                .build();
        System.out.println(firstTestPlane.toString());
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder().setCompany("North-American");
        Plane mustang = planeBuilder.setModel("P-51 Mustang").setMaxSpeed(700).build();
        System.out.println(mustang.toString());
        Plane blackWidow = planeBuilder.setModel("P-61C Black Widow").setMaxSpeed(550).build();
        System.out.println(blackWidow.toString());
    }
}
