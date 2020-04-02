package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int speed;
    private int weight;
    private String model;
    private int places;
    private int rangeOfFlight;

    private Plane(PlaneBuilder builder) {
        this.speed = builder.speed;
        this.weight = builder.weight;
        this.rangeOfFlight = builder.rangeOfFlight;
        this.places = builder.places;
        this.model = builder.model;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public int getPlaces() {
        return places;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public static class PlaneBuilder {
        private int speed;
        private int weight;
        private int places;
        private int rangeOfFlight;
        private String model;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setPlaces(int places) {
            this.places = places;
            return this;
        }

        public PlaneBuilder setRangeOfFlight(int rangeOfFlight) {
            this.rangeOfFlight = rangeOfFlight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
