package core.basesyntax;

public class Plane {
    private String engineType;
    private String type;
    private double enginePower;
    private double maxSpeed;
    private double maxHeight;

    private Plane(PlaneBuilder builder) {

    }

    public String getEngineType() {
        return engineType;
    }

    public String getType() {
        return type;
    }

    public double getEnginePower() {
        return enginePower;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public static class PlaneBuilder {


    }
}
