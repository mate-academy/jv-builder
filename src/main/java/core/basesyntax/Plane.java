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
    private int maxSpeed;
    private int maxHigh;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.maxHigh = builder.maxHigh;
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

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxHigh() {
        return maxHigh;
    }

    public static class PlaneBuilder {
        private String name;
        private String type;
        private String color;
        private int maxSpeed;
        private int maxHigh;

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

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxHigh(int maxHigh) {
            this.maxHigh = maxHigh;
            return this;
        }

        public Plane build() {
            return new Plane(this);

        }
    }
}



