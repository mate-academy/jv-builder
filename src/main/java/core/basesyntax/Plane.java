package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String type;
    private String engineType;
    private int grt;
    private int pwr;

    public Plane(PlaneBuilder builder) {
        this.model = model;
        this.type = type;
        this.engineType = engineType;
        this.grt = grt;
        this.pwr = pwr;
    }

    public static class PlaneBuilder {
        private String model;
        private String type;
        private String engineType;
        private int grt;
        private int pwr;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public PlaneBuilder setGrt(int grt) {
            this.grt = grt;
            return this;
        }

        public PlaneBuilder setPwr(int pwr) {
            this.pwr = pwr;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
