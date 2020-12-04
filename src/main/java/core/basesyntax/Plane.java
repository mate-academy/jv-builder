package core.basesyntax;

public class Plane {
    private String name;
    private String model;
    private String color;
    private int speed;
    private int capacity;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.speed = planeBuilder.speed;
        this.capacity = planeBuilder.capacity;
    }

    @Override
    public String toString() {
        return "PlaneBuilder{"
                + "name='" + name + '\'' + ", model='"
                + model + '\'' + ", color='" + color
                + '\'' + ", speed=" + speed + ", capacity="
                + capacity + '}';
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private String color;
        private int speed;
        private int capacity;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
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

        public Plane build() {
            return new Plane(this);
        }
    }
}
