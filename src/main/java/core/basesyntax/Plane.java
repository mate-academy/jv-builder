package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String color;
    private int speed;
    private int capacity;
    private int maxHeight;

    public Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.color = planeBuilder.color;
        this.speed = planeBuilder.speed;
        this.capacity = planeBuilder.capacity;
        this.maxHeight = planeBuilder.maxHeight;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "name='" + name
                + '\''
                + ", color='" + color
                + '\''
                + ", speed=" + speed
                + ", capacity=" + capacity
                + ", maxHeight=" + maxHeight
                + '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public class PlaneBuilder {
        private String name;
        private String color;
        private int speed;
        private int capacity;
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

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
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
