package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int weight;
    private int quantityOfSeats;
    private int dimensions;

    Plane(String model, String color, int weight,
                  int quantityOfSeats,int dimensions) {

        this.model = model;
        this.color = color;
        this.weight = weight;
        this.quantityOfSeats = quantityOfSeats;
        this.dimensions = dimensions;
    }

    private Plane(PlaneBuilder builder) {
        this.model = builder.model1;
        this.color = builder.color1;
        this.weight = builder.weight1;
        this.quantityOfSeats = builder.quantityOfSeats1;
        this.dimensions = builder.dimensions1;
    }

     static class PlaneBuilder {
        private String model1;
        private String color1;
        private int weight1;
        private int quantityOfSeats1;
        private int dimensions1;

        public PlaneBuilder setModel(String model1) {
            this.model1 = model1;
            return this;
        }

        public PlaneBuilder setColor(String color1) {
            this.color1 = color1;
            return this;
        }

        public PlaneBuilder setWeight(int weight1) {
            this.weight1 = weight1;
            return this;
        }

        public PlaneBuilder setQuantitySeats(int quantityOfSeats1) {
            this.quantityOfSeats1 = quantityOfSeats1;
            return this;
        }

        public PlaneBuilder setDimension(int dimensions1) {
            this.dimensions1 = dimensions1;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}

