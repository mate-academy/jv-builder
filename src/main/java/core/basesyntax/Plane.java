package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int speed;
    private int countPassengers;
    private int weight;
    private int countEngine;

    private Plane(PlaneBuilder planeBuilder) {
        this.countEngine = planeBuilder.countEngine;
        this.countPassengers = planeBuilder.countPassengers;
        this.model = planeBuilder.model;
        this.speed = planeBuilder.speed;
        this.weight = planeBuilder.weight;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public int getWeight() {
        return weight;
    }

    public int getCountEngine() {
        return countEngine;
    }

    public static class PlaneBuilder {
        private String model;
        private int speed;
        private int countPassengers;
        private int weight;
        private int countEngine;

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCountPassengers(int countPassengers) {
            this.countPassengers = countPassengers;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setCountEngine(int countEngine) {
            this.countEngine = countEngine;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return model + " " + weight + " " + speed + " " + countPassengers + " " + countEngine;
    }
}
