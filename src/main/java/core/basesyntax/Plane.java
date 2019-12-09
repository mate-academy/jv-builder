package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 *
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String manufacturer;
    private String model;
    private String type;
    private int speed;
    private int rangeOfflight;

    public Plane(String manufacturer,
                 String model,
                 String type,
                 int speed,
                 int rangeOfflight) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.type = type;
        this.speed = speed;
        this.rangeOfflight = rangeOfflight;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.manufacturer = planeBuilder.manufacturer;
        this.model  = planeBuilder.model;
        this.type = planeBuilder.type;
        this.speed = planeBuilder.speed;
        this.rangeOfflight = planeBuilder.rangeOfflight;
    }

    public static class PlaneBuilder {
        private String manufacturer;
        private String model;
        private String type;
        private int speed;
        private int rangeOfflight;

        public PlaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

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

        public PlaneBuilder setRangeOfflight(int rangeOfflight) {
            this.rangeOfflight = rangeOfflight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
