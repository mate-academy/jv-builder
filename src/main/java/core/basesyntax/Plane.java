package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String type;
    private String color;
    private double power;
    private double speed;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.type = planeBuilder.type;
        this.color = planeBuilder.color;
        this.power = planeBuilder.power;
        this.speed = planeBuilder.speed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public double getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }

    public static class PlaneBuilder {
        private String name;
        private String type;
        private String color;
        private double power;
        private double speed;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setPower(double power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setSpeed(double speed) {
            this.speed = speed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
