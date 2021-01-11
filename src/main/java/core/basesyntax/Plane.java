package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int speed;
    private int weight;
    private int age;
    private String color;

    public Plane(String model, int speed, int weight, int age, String color) {
        this.model = model;
        this.speed = speed;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.speed = builder.speed;
        this.weight = builder.weight;
        this.age = builder.age;
        this.color = builder.color;
    }

    public static class PlaneBuilder {
        private String model;
        private int speed;
        private int weight;
        private int age;
        private String color;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
