package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private double weight;
    private int price;
    private int length;
    private String type;

    private Plane(PlaneBuilder planeBuilder) {
        this.length = planeBuilder.length;
        this.name = planeBuilder.name;
        this.price = planeBuilder.price;
        this.type = planeBuilder.type;
        this.weight = planeBuilder.weight;
    }

    public class PlaneBuilder {
        private String name;
        private double weight;
        private int price;
        private int length;
        private String type;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
