package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String brand;
    private String model;
    private String type;
    private int range;
    private int capacity;

    private Plane(PlaneBuilder planeBuilder) {
        this.brand = planeBuilder.brand;
        this.model = planeBuilder.model;
        this.type = planeBuilder.type;
        this.range = planeBuilder.range;
        this.capacity = planeBuilder.capacity;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getRange() {
        return range;
    }

    public int getCapacity() {
        return capacity;
    }

    public static class PlaneBuilder {
        private String brand;
        private String model;
        private String type;
        private int range;
        private int capacity;

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
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

        public PlaneBuilder setRange(int range) {
            this.range = range;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
