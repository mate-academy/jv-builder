package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private int weight;
    private int length;
    private int width;
    private int numberOfSeats;

    public Plane(String name, int weight, int length, int width, int numberOfSeats) {
        this.name = name;
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.numberOfSeats = numberOfSeats;
    }

    public static class PlaneBuilder {
        private String name;
        private int weight;
        private int length;
        private int width;
        private int numberOfSeats;

        public PlaneBuilder setName(String name) {
            this.name = name;
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

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Plane build() {
            return new Plane(name, weight, length, width, numberOfSeats);
        }

    }
}
