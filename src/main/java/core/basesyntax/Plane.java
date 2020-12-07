package core.basesyntax;

public class Plane {
    private String model;
    private int height;
    private int weight;
    private int maxSpeed;
    private int maxHeight;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.height = builder.height;
        this.weight = builder.weight;;
        this.maxHeight = builder.maxHeight;
        this.maxSpeed = builder.maxSpeed;
    }

    public static class PlaneBuilder {
        private String model;
        private int height;
        private int weight;
        private int maxSpeed;
        private int maxHeight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane{" + "model='" + model + '\''
                + ", height=" + height + ", weight=" + weight
                + ", maxSpeed=" + maxSpeed + ", maxHeight="
                + maxHeight + '}';
    }
}
