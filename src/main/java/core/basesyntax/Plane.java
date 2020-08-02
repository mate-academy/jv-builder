package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String color;
    private int maxSpeed;
    private int liftingCapacity;
    private int maxHeight;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.color = planeBuilder.color;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.liftingCapacity = planeBuilder.liftingCapacity;
        this.maxHeight = planeBuilder.maxHeight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public static class PlaneBuilder {
        private String name;
        private String color;
        private int maxSpeed;
        private int liftingCapacity;
        private int maxHeight;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
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

        public PlaneBuilder setLiftingCapacity(int liftingCapacity) {
            this.liftingCapacity = liftingCapacity;
            return this;
        }

        public PlaneBuilder setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
