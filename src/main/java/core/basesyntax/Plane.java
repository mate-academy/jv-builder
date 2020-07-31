package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int maxSpeed;
    private String model;
    private String type;
    private int amountOfPassenger;
    private int weight;

    private Plane(PlaneBuilder planeBuilder) {
        this.maxSpeed = planeBuilder.maxSpeed;
        this.model = planeBuilder.model;
        this.type = planeBuilder.type;
        this.amountOfPassenger = planeBuilder.amountOfPassenger;
        this.weight = planeBuilder.weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getAmountOfPassenger() {
        return amountOfPassenger;
    }

    public int isSeaplane() {
        return weight;
    }

    @Override
    public String toString() {
        return "Information about plane model " + model
                + "\n type " + type
                + "\n max speed '" + maxSpeed
                + "\n weight  " + weight
                + "\n maximum amount of passengers are  " + amountOfPassenger;
    }

    public static class PlaneBuilder {
        private int maxSpeed;
        private String model;
        private String type;
        private int amountOfPassenger;
        private int weight;

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setAmountOfPassenger(int amountOfPassenger) {
            this.amountOfPassenger = amountOfPassenger;
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
