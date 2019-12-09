package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plane. Внести все необходимые изменения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int crew;
    private int maxSpeed;
    private String engineType;
    private int numberOfEngine;
    private int ceiling;

    public int getCrew() {
        return crew;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getNumberOfEngine() {
        return numberOfEngine;
    }

    public int getCeiling() {
        return ceiling;
    }

    public Plane(int crew, int maxSpeed, String engineType, int numberOfEngine, int ceiling) {
        this.crew = crew;
        this.maxSpeed = maxSpeed;
        this.engineType = engineType;
        this.numberOfEngine = numberOfEngine;
        this.ceiling = ceiling;
    }

    public class PlaneBuilder {

        public PlaneBuilder setCrew(int crew) {
            Plane.this.crew = crew;

            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            Plane.this.maxSpeed = maxSpeed;

            return this;
        }

        public PlaneBuilder setEngineType(String engineType) {
            Plane.this.engineType = engineType;

            return this;
        }

        public PlaneBuilder setNumberOfEngine(int numberOfEngine) {
            Plane.this.numberOfEngine = numberOfEngine;
            return this;
        }

        public PlaneBuilder setCeiling(int ceiling) {
            Plane.this.ceiling = ceiling;
            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
