package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String mark;
    private String model;
    private double speed;
    private double weight;
    private int numberOfTurbines;

    public Plane(PlaneBuilder planeBuilder) {
        this.mark = planeBuilder.mark;
        this.model = planeBuilder.model;
        this.speed = planeBuilder.speed;
        this.weight = planeBuilder.weight;
        this.numberOfTurbines = planeBuilder.numberOfTurbines;
    }

    public static class PlaneBuilder {

        private String mark;
        private String model;
        private double speed;
        private double weight;
        private int numberOfTurbines;

        public PlaneBuilder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setSpeed(double speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setNumberOfTurbines(int numberOfTurbines) {
            this.numberOfTurbines = numberOfTurbines;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
