package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
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

    public static class PlaneBuilder {

        private String manufacturer;
        private String model;
        private String type;
        private int speed;
        private int rangeOfflight;

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public void setrangeOfflight(int rangeOfflight) {
            this.rangeOfflight = rangeOfflight;
        }

        public Plane build() {
            return new Plane(manufacturer, model, type, speed, rangeOfflight);
        }
    }
}
