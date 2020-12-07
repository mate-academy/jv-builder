package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int length;
    private int wide;
    private int price;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.length = planeBuilder.length;
        this.wide = planeBuilder.wide;
        this.price = planeBuilder.price;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", length=" + length
                + ", wide=" + wide
                + ", price=" + price
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int length;
        private int wide;
        private int price;

        public Plane build() {
            return new Plane(this);
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWide(int wide) {
            this.wide = wide;
            return this;
        }

        public PlaneBuilder setPrice(int price) {
            this.price = price;
            return this;
        }
    }
}
