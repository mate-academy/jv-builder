package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String type;
    private double lengthOfPlane;
    private int amountEngine;
    private int maxSpeed;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.lengthOfPlane = builder.lengthOfPlane;
        this.amountEngine = builder.amountEngine;
        this.maxSpeed = builder.maxSpeed;
    }

    @Override
    public String toString() {
        return "Plane{name: " + name
                + "type: " + type
                + "length of Plane: " + lengthOfPlane
                + "amount of engine: " + amountEngine
                + "max speed: " + maxSpeed + '}';
    }

    public String getName(String name) {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getLengthOfPlane() {
        return lengthOfPlane;
    }

    public int getAmountEngine() {
        return amountEngine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public class PlaneBuilder {
        private String name;
        private String type;
        private double lengthOfPlane;
        private int amountEngine;
        private int maxSpeed;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setName(String name) {
            this.type = name;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setLengthOfPlane(double lengthOfPlane) {
            this.lengthOfPlane = lengthOfPlane;
            return this;
        }

        public PlaneBuilder setAmountEngine(int amountEngine) {
            this.amountEngine = amountEngine;
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
