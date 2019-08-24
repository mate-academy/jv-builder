package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private int maxSpeed;
    private String color;
    private double length;
    private double width;
    private int engines;
    private  String name;

    public Plane(int maxSpd, String color, double length, double width, int engines, String name) {
        this.maxSpeed = maxSpd;
        this.color = color;
        this.length = length;
        this.width = width;
        this.engines = engines;
        this.name = name;
    }

    private Plane(PlaneBuilder builder) {
        maxSpeed = builder.maxSpeed;
        color = builder.color;
        length = builder.length;
        width = builder.width;
        engines = builder.engines;
        name = builder.name;
    }

    public String getName() {
        return name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getLength() {
        return length;
    }

    public String getColor() {
        return color;
    }

    public double getWidth() {
        return width;
    }

    public int getEngines() {
        return engines;
    }

    public static class PlaneBuilder {
        private int maxSpeed;
        private String color;
        private double length;
        private double width;
        private int engines;
        private String name;

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public String getColor() {
            return color;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public int getEngines() {
            return engines;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public PlaneBuilder() {
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setLength(double length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWidth(double width) {
            this.width = width;
            return this;
        }

        public PlaneBuilder setEngines(int engines) {
            this.engines = engines;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
