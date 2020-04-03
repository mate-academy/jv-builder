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

    public Plane(PlaneBuilder planeBuilder) {
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
        private String model;
        private String destination;
        private int weight;
        private int engineQuantity;
        private int wingsQuantity;
        private String speedType;
        private int year;

        public void setModel(String model) {
            this.model = model;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setEngineQuantity(int engineQuantity) {
            this.engineQuantity = engineQuantity;
        }

        public void setWingsQuantity(int wingsQuantity) {
            this.wingsQuantity = wingsQuantity;
        }

        public void setSpeedType(String speedType) {
            this.speedType = speedType;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
