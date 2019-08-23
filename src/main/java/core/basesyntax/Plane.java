package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private int maxSpeed;
    private int length;
    private int width;
    private int weight;

    public Plane(String name, int maxSpeed, int length, int width, int weight) {
        this.name = name;
        this.maxSpeed = maxSpeed;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.length = builder.length;
        this.width = builder.width;
        this.weight = builder.weight;
    }

    public static class PlaneBuilder {
        private String name;
        private int maxSpeed;
        private int length;
        private int width;
        private int weight;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWidth(int width) {
            this.width = width;
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