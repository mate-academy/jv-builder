package core.basesyntax;

public class Plane {
    private String model;
    private String type;
    private int speed;
    private int fuelCapacity;
    private int flyingHeight;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.type = planeBuilder.type;
        this.speed = planeBuilder.speed;
        this.fuelCapacity = planeBuilder.fuelCapacity;
        this.flyingHeight = planeBuilder.flyingHeight;
    }

    public static class PlaneBuilder {
        private String model;
        private String type;
        private int speed;
        private int fuelCapacity;
        private int flyingHeight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setFuelCapacity(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
            return this;
        }

        public PlaneBuilder setFlyingHeight(int flyingHeight) {
            this.flyingHeight = flyingHeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
