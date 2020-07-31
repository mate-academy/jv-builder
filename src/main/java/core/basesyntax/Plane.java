package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int maxSpeed;
    private String model;
    private int weight;
    private String type;
    private int amountOfPassengers;

    private Plane(PlaneBuilder builder) {
        this.model = builder.setModel;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public class PlaneBuilder {
        public String setModel;

        private PlaneBuilder() {

        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            Plane.this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            Plane.this.model = model;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            Plane.this.weight = weight;
            return this;
        }

        public PlaneBuilder setType(String type) {
            Plane.this.type = type;
            return this;
        }

        public PlaneBuilder setAmountOfPassengers(int amountOfPassengers) {
            Plane.this.amountOfPassengers = amountOfPassengers;
            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
