package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String model;
    private int weight;
    private int maxSpeed;
    private int maxHeight;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.maxSpeed = builder.maxSpeed;
        this.maxSpeed = builder.maxSpeed;
        this.maxHeight = builder.maxHeight;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getModel(String model) {
        this.model = model;
    }

    public void getWeight(int weight) {
        this.weight = weight;
    }

    public void getMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void getMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public static class PlaneBuilder {

        private String name;
        private String model;
        private int weight;
        private int maxSpeed;
        private int maxHeight;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}


