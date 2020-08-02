package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String color;
    private int weight;
    private int length;
    private int width;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.weight = builder.weight;
        this.length = builder.length;
        this.width = builder.width;
    }

    public static class PlaneBuilder {
        private String name;
        private String color;
        private int weight;
        private int length;
        private int width;

        public PlaneBuilder setName(String name) {
            this.name = name;
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

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
