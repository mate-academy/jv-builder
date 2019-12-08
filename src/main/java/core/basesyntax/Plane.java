package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int length;
    private int height;
    private int width;
    private double maxSpeed;
    private String color;
    private String name;

    public Plane(int length, int height, int width, double maxSpeed, String color, String name) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.maxSpeed = maxSpeed;
        this.color = color;
        this.name = name;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.length = planeBuilder.length;
        this.height = planeBuilder.height;
        this.width = planeBuilder.width;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.color = planeBuilder.color;
        this.name = planeBuilder.name;
    }

    public static class PlaneBuilder {
        private int length;
        private int height;
        private int width;
        private double maxSpeed;
        private String color;
        private String name;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PlaneBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public PlaneBuilder setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
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
