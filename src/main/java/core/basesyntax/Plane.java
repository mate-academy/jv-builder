package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int countOfSeats;
    private double price;
    private int buildYear;
    private String color;

    public Plane(PlaneBuilder builder) {
    }

    public String getModel() {
        return model;
    }

    public int getCountOfSeats() {
        return countOfSeats;
    }

    public double getPrice() {
        return price;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public String getColor() {
        return color;
    }

    public static class PlaneBuilder {
        private String model;
        private int countOfSeats;
        private double price;
        private int buildYear;
        private String color;

        public PlaneBuilder() {
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCountOfSeats(int countOfSeats) {
            this.countOfSeats = countOfSeats;
            return this;
        }

        public PlaneBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public PlaneBuilder setBuildYear(int buildYear) {
            this.buildYear = buildYear;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
