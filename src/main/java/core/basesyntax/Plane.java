package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int weight;
    private int sits;
    private int dimensions;

    public Plane(String model, String color, int weight,
                 int sits, int dimensions) {
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.sits = sits;
        this.dimensions = dimensions;
    }

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.weight = builder.weight;
        this.sits = builder.sits;
        this.dimensions = builder.dimensions;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int weight;
        private int sits;
        private int dimensions;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setSits(int sits) {
            this.sits = sits;
            return this;
        }

        public PlaneBuilder setDimensions(int dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}


