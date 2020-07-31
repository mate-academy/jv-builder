package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String model;
    private String colour;
    private int speed;
    private int places;
    private int weight;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.colour = builder.colour;
        this.speed = builder.speed;
        this.places = builder.places;
        this.weight = builder.weight;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPlaces() {
        return places;
    }

    public int getWeight() {
        return weight;
    }

    public static class PlaneBuilder {

        private String model;
        private String colour;
        private int speed;
        private int places;
        private int weight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setPlaces(int places) {
            this.places = places;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
