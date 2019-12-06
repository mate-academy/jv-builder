package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public final class Plane {
    private final String name;
    private final String model;
    private final int maxSpeed;
    private final double maxHeight;
    private final int maxSeats;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.maxSpeed = builder.maxSpeed;
        this.maxHeight = builder.maxHeight;
        this.maxSeats = builder.maxSeats;
    }

    public Plane(String name, String model, int maxSpeed, double maxHeight, int maxSeats) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
        this.maxSeats = maxSeats;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private int maxSpeed;
        private double maxHeight;
        private int maxSeats;

        // Setters
        public PlaneBuilder setMaxHeight(double maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public PlaneBuilder setMaxSeats(int maxSeats) {
            this.maxSeats = maxSeats;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
