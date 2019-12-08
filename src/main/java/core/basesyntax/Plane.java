package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int countOfEngine;
    private int weight;
    private int countOfStaff;
    private int countOfPassengers;

    public Plane(String model, int countOfEngine,
                 int weight, int countOfStaff, int countOfPassengers) {
        this.model = model;
        this.countOfEngine = countOfEngine;
        this.weight = weight;
        this.countOfStaff = countOfStaff;
        this.countOfPassengers = countOfPassengers;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.countOfEngine = planeBuilder.countOfEngine;
        this.weight = planeBuilder.weight;
        this.countOfStaff = planeBuilder.countOfStaff;
        this.countOfPassengers = planeBuilder.countOfPassengers;
    }

    public static class PlaneBuilder {
        private String model;
        private int countOfEngine;
        private int weight;
        private int countOfStaff;
        private int countOfPassengers;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCountOfEngine(int countOfEngine) {
            this.countOfEngine = countOfEngine;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setCountOfStaff(int countOfStaff) {
            this.countOfStaff = countOfStaff;
            return this;
        }

        public PlaneBuilder setCountOfPassengers(int countOfPassengers) {
            this.countOfPassengers = countOfPassengers;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
