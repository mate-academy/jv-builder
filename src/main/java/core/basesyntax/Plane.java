package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int weight;
    private int length;
    private int year;
    private int speed;

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public Plane(String model, int weight, int length, int year, int speed) {
        this.model = model;
        this.weight = weight;
        this.length = length;
        this.year = year;
        this.speed = speed;
    }

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.weight = builder.weight;
        this.length = builder.length;
        this.year = builder.year;
        this.speed = builder.speed;
    }

    public static class PlaneBuilder {
        private String model;
        private int weight;
        private int length;
        private int year;
        private int speed;

        public PlaneBuilder setModel(String model) {
            this.model = model;
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

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
