package core.basesyntax;

/**
 * Создайте свою собственную реализацию паттерна Builder для класса Plane
 * Добавьте не менее пяти полей в класс Plane
 */

public class Plane {
    private String brand;
    private String color;
    private int model;
    private int speed;
    private int productionYear;

    public Plane(String brand, String color, int model, int speed, int productionYear) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.model = model;
        this.productionYear = productionYear;
    }

    private Plane(PlaneBuilder builder) {
        this.brand = builder.brand;
        this.color = builder.color;
        this.speed = builder.speed;
        this.model = builder.model;
        this.productionYear = builder.productionYear;
    }

    public static class PlaneBuilder {
        private String brand;
        private String color;
        private int model;
        private int speed;
        private int productionYear;

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setModel(int model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setProductionYear(int productionYear) {
            this.productionYear = productionYear;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
