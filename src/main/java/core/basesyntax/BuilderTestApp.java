package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane plane = new Plane.PlaneBuilder()
                .setNameCompany("AirLines")
                .setModel("TU-89")
                .setPower(20000)
                .setIsFirstClass(false)
                .setCountryConnect("Poland")
                .build();
        System.out.println(plane.toString());
    }
}
