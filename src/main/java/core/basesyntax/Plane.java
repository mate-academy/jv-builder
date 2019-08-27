package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private int number;
    private int age;
    private int speed;
    private String manufacturer;
    private String color;

    public Plane(int number, int age, int speed, String manufacturer, String color) {
        this.number = number;
        this.age = age;
        this.speed = speed;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    private Plane(PlaneBuilder builder) {
        this.number = builder.number;
        this.age = builder.age;
        this.speed = builder.speed;
        this.manufacturer = builder.manufacturer;
        this.color = builder.color;
    }

    public static class PlaneBuilder {
        private int number;
        private int age;
        private int speed;
        private String manufacturer;
        private String color;

        public PlaneBuilder setNumber(int number) {
            this.number = number;
            return this;
        }

        public PlaneBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
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
