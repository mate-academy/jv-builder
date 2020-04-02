package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String mark;
    private String model;
    private String typeOfPlane;
    private int numberOfEngine;
    private int maxSpeed;

    private Plane(PlaneBuilder planeBuilder) {
        this.mark = planeBuilder.mark;
        this.model = planeBuilder.model;
        this.typeOfPlane = planeBuilder.typeOfPlane;
        this.numberOfEngine = planeBuilder.numberOfEngine;
        this.maxSpeed = planeBuilder.maxSpeed;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class PlaneBuilder {
        private String mark;
        private String model;
        private String typeOfPlane;
        private int numberOfEngine;
        private int maxSpeed;

        public PlaneBuilder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setTypeOfPlane(String typeOfPlane) {
            this.typeOfPlane = typeOfPlane;
            return this;
        }

        public PlaneBuilder setNumberOfEngine(int numberOfEngine) {
            this.numberOfEngine = numberOfEngine;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}
