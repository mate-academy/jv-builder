package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int id;
    private int weight;
    private int speed;
    private String model;
    private String color;

    private Plane(PlaneBuilder planeBuilder) {
        id = planeBuilder.id;
        weight = planeBuilder.weight;
        speed = planeBuilder.speed;
        model = planeBuilder.model;
        color = planeBuilder.color;
    }

    public static class PlaneBuilder {
        private int id;
        private int weight;
        private int speed;
        private String model;
        private String color;

        public PlaneBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
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

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane{"
                + "id=" + id
                + ", weight=" + weight
                + ", speed=" + speed
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + '}';
    }
}
