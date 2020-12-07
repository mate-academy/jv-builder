package core.basesyntax;

public class Plane {
    private String model;
    private String type;
    private int capacity;
    private int maxSpeed;
    private int maxHeight;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.type = builder.type;
        this.capacity = builder.capacity;
        this.maxSpeed = builder.maxSpeed;
        this.maxHeight = builder.maxHeight;
    }

    @Override
    public String toString() {
        return "Model:" + model + "\n"
                + "Type:" + type + "\n"
                + "Capacity:" + capacity + "\n"
                + "Max Speed:" + maxSpeed + "\n"
                + "Max Height:" + maxHeight + "\n";
    }

    public static class PlaneBuilder {
        private String model;
        private String type;
        private int capacity;
        private int maxSpeed;
        private int maxHeight;

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
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
}
