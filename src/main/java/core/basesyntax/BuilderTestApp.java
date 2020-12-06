package core.basesyntax;

public class BuilderTestApp {
    public static void main(String[] args) {
        Plane firstPlane = new Plane.PlaneBuilder()
                .setModel("Boeing 747")
                .setColor("White")
                .setYear(2013)
                .setCountryMaker("USA")
                .setMaxSpeed(830)
                .build();
        Plane secondPlane = new Plane.PlaneBuilder()
                .setModel("Boeing 747")
                .setColor("White")
                .setYear(2011)
                .setCountryMaker("USA")
                .setMaxSpeed(823)
                .build();
        Plane thirdPlane = new Plane.PlaneBuilder()
                .setModel("Boeing 777")
                .setColor("Grey")
                .setYear(2016)
                .setCountryMaker("USA")
                .setMaxSpeed(820)
                .build();
        Plane fourthPlane = new Plane.PlaneBuilder()
                .setModel("Boeing 777")
                .setColor("Blue")
                .setYear(2017)
                .setCountryMaker("USA")
                .setMaxSpeed(841)
                .build();
        Plane fifthPlane = new Plane.PlaneBuilder()
                .setModel("Boeing 777")
                .setColor("White")
                .setYear(2008)
                .setCountryMaker("USA")
                .build();
        System.out.println(firstPlane.toString());
        System.out.println(secondPlane.toString());
        System.out.println(thirdPlane.toString());
        System.out.println(fourthPlane.toString());
        System.out.println(fifthPlane.toString());
    }
}
