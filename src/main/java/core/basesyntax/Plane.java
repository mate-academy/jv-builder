package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int crew;
    private int capacity;
    private int maxSpeed;
    private int range;
    private int emptyWeight;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.crew = builder.crew;
        this.capacity = builder.capacity;
        this.maxSpeed = builder.maxSpeed;
        this.range = builder.range;
        this.emptyWeight = builder.emptyWeight;
    }

    public String getModel() {
        return model;
    }

    public int getCrew() {
        return crew;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getRange() {
        return range;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public static class PlaneBuilder {

        private String model;
        private int crew;
        private int capacity;
        private int maxSpeed;
        private int range;
        private int emptyWeight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCrew(int crew) {
            this.crew = crew;
            return this;
        }

        public PlaneBuilder setCapacity() {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setMaxSpeed() {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setRange() {
            this.range = range;
            return this;
        }

        public PlaneBuilder setEmptyWeight() {
            this.emptyWeight = emptyWeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
