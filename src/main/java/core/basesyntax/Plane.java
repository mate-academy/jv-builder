package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String model;
    private String manufacturer;
    private String engineName;
    private String constructorName;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.manufacturer = builder.manufacturer;
        this.engineName = builder.engineName;
        this.constructorName = builder.constructorName;
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private String manufacturer;
        private String engineName;
        private String constructorName;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public PlaneBuilder setEngineName(String engineName) {
            this.engineName = engineName;
            return this;
        }

        public PlaneBuilder setConstructorName(String constructorName) {
            this.constructorName = constructorName;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
