package core.basesyntax;

public class BuilderTestApp {
  public static void main(String[] args) {
    Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder()
            .setModel("T25")
            .setColor("White");

    Plane planeYear = planeBuilder.setYearIssue(19990).build();
    System.out.println(planeYear.toString());

    Plane fastPlane = planeBuilder.setSpeed(3000).setYearIssue(2020).build();
    System.out.println(fastPlane);

    Plane breakPlane = planeBuilder.setSpeed(-1).build();
    System.out.println(breakPlane.toString());
  }
}
