package core.basesyntax;

public class Plane {
    private String engineType;
    private String planeType;
    private double enginePower;
    private double maxSpeed;
    private double maxHeight;

    private Plane(PlaneBuilder builder) {
        this.engineType = builder.engineType;
        this.planeType = builder.planeType;
        this.enginePower = builder.enginePower;
        this.maxSpeed = builder.maxSpeed;
        this.maxHeight = builder.maxHeight;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getPlaneType() {
        return planeType;
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
        private String engineType;
        private String planeType;
        private double enginePower;
        private double maxSpeed;
        private double maxHeight;

        public PlaneBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public PlaneBuilder setPlaneType(String planeType) {
            this.planeType = planeType;
            return this;
        }

        public PlaneBuilder setEnginePower(double enginePower) {
            if (enginePower <= 0) {
                throw new RuntimeException("Plane engine cannot be bellow or zero");
            }
            this.enginePower = enginePower;
            return this;
        }

        public PlaneBuilder setMaxSpeed(double maxSpeed) {
            if (enginePower <= 0) {
                throw new RuntimeException("Plane max speed cannot be bellow or zero");
            }
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxHeight(double maxHeight) {
            if (enginePower <= 0) {
                throw new RuntimeException("Plane max height cannot be bellow or zero");
            }
            this.maxHeight = maxHeight;
            return this;
        }


    }
}
