package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String colour;
    private String model;
    private int id;
    private String owner;
    private int numberOfFlights;

    private Plane(PlaneBuilder planeBuilder) {
        this.colour = planeBuilder.colour;
        this.model = planeBuilder.model;
        this.id = planeBuilder.id;
        this.owner = planeBuilder.owner;
        this.numberOfFlights = planeBuilder.numberOfFlights;
    }

    public static class PlaneBuilder {
        private int numberOfFlights;
        private String colour;
        private String model;
        private int id;
        private String owner;

        public void setColour(String colour) {
            this.colour = colour;
        }

        public void setNumberOfFlights(int numberOfFlights) {
            this.numberOfFlights = numberOfFlights;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public PlaneBuilder withColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder withModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public PlaneBuilder withNumberOfFlights(int numberOfFlights) {
            this.numberOfFlights = numberOfFlights;
            return this;
        }

        public Plane build() {

            return new Plane(this);
        }

    }

}
