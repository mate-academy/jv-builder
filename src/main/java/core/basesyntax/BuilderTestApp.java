package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane ju87 = new Plane.PlaneBuilder()
                .setManufacturer("Junkers")
                .setModel("Ju 87D")
                .setType("Dive bomber")
                .setFirstFlight(1935)
                .setIntroduction(1936)
                .build();
        Plane bf109 = new Plane.PlaneBuilder()
                .setManufacturer("Messerschmitt AG")
                .setModel("Bf 109G-6")
                .setType("Fighter")
                .setFirstFlight(1935)
                .setIntroduction(1937)
                .setMaxHeight(12000)
                .setMaxSpeed(640)
                .build();
        Plane b17 = new Plane.PlaneBuilder()
                .setManufacturer("Boeing")
                .setModel("B-17G")
                .setType("Heavy bomber")
                .setFirstFlight(1935)
                .setIntroduction(1938)
                .setMaxHeight(10850)
                .setMaxSpeed(462)
                .build();
        Plane fw200 = new Plane.PlaneBuilder()
                .setManufacturer("Focke-Wulf")
                .setModel("Fw 200 C-3/U2")
                .setIntroduction(1937)
                .build();
        
        System.out.println(ju87);
        System.out.println(bf109);
        System.out.println(b17);
        System.out.println(fw200);
    }
}
