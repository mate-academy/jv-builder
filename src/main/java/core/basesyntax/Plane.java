package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String type;
    private int maxSpeed;
    private int maxSeats;
    private double maxCargo;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.maxSpeed = builder.maxSpeed;
        this.maxCargo = builder.maxCargo;
        this.maxSeats = builder.maxSeats;
    }

    public static class PlaneBuilder {
        private String name;
        private String type;
        private int maxSpeed;
        private double maxCargo;
        private int maxSeats;

        public PlaneBuilder() {
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxSeats(int maxSeats) {
            this.maxSeats = maxSeats;
            return this;
        }

        public PlaneBuilder setMaxCargo(double maxCargo) {
            this.maxCargo = maxCargo;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

        public static PlaneBuilder builder() {
            return new PlaneBuilder();
        }
    }
}
