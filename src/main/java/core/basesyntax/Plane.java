package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private String color;
    private int span;
    private int tank;
    private int weight;

    public Plane(String name, String color, int span, int tank, int weight) {
        this.name = name;
        this.color = color;
        this.span = span;
        this.tank = tank;
        this.weight = weight;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.color = planeBuilder.color;
        this.span = planeBuilder.span;
        this.tank = planeBuilder.tank;
        this.weight = planeBuilder.weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSpan() {
        return span;
    }

    public int getTank() {
        return tank;
    }

    public int getWeight() {
        return weight;
    }

    public static class PlaneBuilder {
        private String name;
        private String color;
        private int span;
        private int tank;
        private int weight;

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

        public PlaneBuilder setSpan(int span) {
            this.span = span;
            return this;
        }

        public PlaneBuilder setTank(int tank) {
            this.tank = tank;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
