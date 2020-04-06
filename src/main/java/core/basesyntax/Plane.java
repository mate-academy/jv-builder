package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public final class Plane {
    private String model;
    private String destination;
    private int weight;
    private int engineQuantity;
    private int wingsQuantity;
    private String speedType;
    private int year;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.destination = planeBuilder.destination;
        this.weight = planeBuilder.weight;
        this.engineQuantity = planeBuilder.engineQuantity;
        this.wingsQuantity = planeBuilder.wingsQuantity;
        this.speedType = planeBuilder.speedType;
        this.year = planeBuilder.year;
    }

    public String getModel() {
        return model;
    }

    public String getDestination() {
        return destination;
    }

    public int getWeight() {
        return weight;
    }

    public int getEngineQuantity() {
        return engineQuantity;
    }

    public int getWingsQuantity() {
        return wingsQuantity;
    }

    public String getSpeedType() {
        return speedType;
    }

    public int getYear() {
        return year;
    }

    public static class PlaneBuilder {
        private int weight;
        private String model;
        private String destination;
        private int engineQuantity;
        private int wingsQuantity;
        private String speedType;
        private int year;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setDestination(String destination) {
            this.destination = destination;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setEngineQuantity(int engineQuantity) {
            this.engineQuantity = engineQuantity;
            return this;
        }

        public PlaneBuilder setWingsQuantity(int wingsQuantity) {
            this.wingsQuantity = wingsQuantity;
            return this;
        }

        public PlaneBuilder setSpeedType(String speedType) {
            this.speedType = speedType;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
