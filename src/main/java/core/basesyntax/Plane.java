package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int power;
    private int maxSpeed;
    private int maxHeight;

    public Plane(String model, String color, int power, int maxSpeed, int maxHeight) {
        this.model = model;
        this.color = color;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int power;
        private int maxSpeed;
        private int maxHeight;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            this.power = power;
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
            return new Plane(model, color, power, maxSpeed, maxHeight);
        }
    }
}
