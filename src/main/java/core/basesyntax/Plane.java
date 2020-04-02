package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String color;
    private String model;
    private int cruisingSpeed;
    private double maxFlightRange;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.model = builder.model;
        this.cruisingSpeed = builder.cruisingSpeed;
        this.maxFlightRange = builder.maxFlightRange;
    }

    public static class PlaneBuilder {

        private String name;
        private String color;
        private String model;
        private int cruisingSpeed;
        private double maxFlightRange;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCruisingSpeed(int cruisingSpeed) {
            this.cruisingSpeed = cruisingSpeed;
            return this;
        }

        public PlaneBuilder setMaxFlightRange(double maxFlightRange) {
            this.maxFlightRange = maxFlightRange;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
