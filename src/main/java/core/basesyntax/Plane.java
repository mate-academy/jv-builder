package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String color;
    private String configuration;
    private String serialNumber;
    private int power;
    private int maxSpeed;

    public Plane(PlaneBuilder builder) {
        this.color = builder.color;
        this.configuration = builder.configuration;
        this.serialNumber = builder.serialNumber;
        this.power = builder.power;
        this.maxSpeed = builder.maxSpeed;
    }

    public static class PlaneBuilder {

        private String color;
        private String configuration;
        private String serialNumber;
        private int power;
        private int maxSpeed;

        public PlaneBuilder() {
        }

        public PlaneBuilder setConfiguration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
