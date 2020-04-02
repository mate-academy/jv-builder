package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String name;
    private String model;
    private int age;
    private int height;
    private int weight;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.model = planeBuilder.model;
        this.age = planeBuilder.age;
        this.height = planeBuilder.height;
        this.weight = planeBuilder.weight;
    }

    public static class PlaneBuilder {

        private String name;
        private String model;
        private int age;
        private int height;
        private int weight;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String surname) {
            this.model = surname;
            return this;
        }

        public PlaneBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PlaneBuilder setHeight(int height) {
            this.height = height;
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
