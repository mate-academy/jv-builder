package core.basesyntax;

public class Plane {
    private String model;
    private String name;
    private int maxHeigthFly;
    private int maxSpeed;
    private int countPassagers;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.name = builder.name;
        this.maxHeigthFly = builder.maxHeigthFly;
        this.maxSpeed = builder.maxSpeed;
        this.countPassagers = builder.countPassagers;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", name='" + name + '\''
                + ", maxHeigthFly=" + maxHeigthFly
                + ", maxSpeed=" + maxSpeed
                + ", countPassagers=" + countPassagers
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String name;
        private int maxHeigthFly;
        private int maxSpeed;
        private int countPassagers;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setMaxHeigthFly(int maxHeigthFly) {
            this.maxHeigthFly = maxHeigthFly;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setCountPassagers(int countPassagers) {
            this.countPassagers = countPassagers;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
