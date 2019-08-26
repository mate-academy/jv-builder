package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private int ceiling;
    private int size;
    private int price;
    private String colour;
    private String produce;

    public Plane(int ceiling, int size, int price, String colour, String produce) {
        this.ceiling = ceiling;
        this.size = size;
        this.price = price;
        this.colour = colour;
        this.produce = produce;
    }

    private Plane(PlaneBuilder builder) {
        ceiling = builder.ceiling;
        size = builder.size;
        price = builder.price;
        colour = builder.colour;
        produce = builder.produce;
    }

    public static class PlaneBuilder {
        private int ceiling;
        private int size;
        private int price;
        private String colour;
        private String produce;

        public PlaneBuilder setCeiling(int ceiling) {
            this.ceiling = ceiling;
            return this;
        }

        public PlaneBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public PlaneBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setProduce(String produce) {
            this.produce = produce;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
