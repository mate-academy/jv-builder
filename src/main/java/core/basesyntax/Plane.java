package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private int maxSpeed;
    private int capacityPassagers;
    private int capacityFuel;
    private int weight;

    public Plane(PlaneBuilder builder){
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.capacityPassagers = builder.capacityPassagers;
        this.capacityFuel = builder.capacityFuel;
        this.weight = builder.weight;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCapacityPassagers() {
        return capacityPassagers;
    }

    public int getCapacityFuel() {
        return capacityFuel;
    }

    public int getWeight() {
        return weight;
    }

    public static class PlaneBuilder {
        private String name;
        private int maxSpeed;
        private int capacityPassagers;
        private int capacityFuel;
        private int weight;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setCapacityPassagers(int capacityPassagers) {
            this.capacityPassagers = capacityPassagers;
            return this;
        }

        public PlaneBuilder setCapacityFuel(int capacityFuel) {
            this.capacityFuel = capacityFuel;
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
