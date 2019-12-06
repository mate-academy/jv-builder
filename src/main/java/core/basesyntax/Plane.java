package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String model;
    private int maxRange;
    private int capacity;
    private int age;

    public Plane(String name, String model, int maxRange, int capacity, int age) {
        this.name = name;
        this.model = model;
        this.maxRange = maxRange;
        this.capacity = capacity;
        this.age = age;
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private int maxRange;
        private int capacity;
        private int age;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setMaxRange(int maxRange) {
            this.maxRange = maxRange;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Plane build() {
            return new Plane(name, model, maxRange, capacity, age);
        }
    }
}
