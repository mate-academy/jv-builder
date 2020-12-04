package core.basesyntax;

public class BuilderTestApp {

  public static void main(String[] args) {

    Plane boeing747 = new Plane.PlaneBuilder()
                    .setName("Boeing 747")
                    .setAirPlaneType("passengers")
                    .setYear(2018)
                    .setCapacity(480)
                    .build();

    System.out.println(boeing747.toString());

    Plane.PlaneBuilder airbus = new Plane.PlaneBuilder()
                      .setColor("White")
                      .setCelling(13000);

    Plane airbusA330 = airbus.setName("Airbus A330")
                      .setAirPlaneType("passengers")
                      .setCapacity(246)
                      .setRange(13450).build();

    Plane airbusA330neo = airbus.setName("Airbus A330neo")
                          .setAirPlaneType("passengers")
                          .setCapacity(260)
                          .setRange(15000)
                          .build();

    System.out.println(airbusA330.toString());
    System.out.println(airbusA330neo.toString());






  }
}
