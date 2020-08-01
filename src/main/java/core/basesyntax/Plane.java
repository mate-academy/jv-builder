package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изменения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public final class Plane {
    private String name;
    private String model;
    private String color;
    private int speed;
    private int weight;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.color = builder.color;
        this.speed = builder.speed;
        this.weight = builder.weight;
    }

    @Override
    public String toString() {
        return "Plane{" + "name=" + name + ", model " + model + ", color- "
                + color + ", speed- " + speed + ", weight- " + weight;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private String color;
        private int speed;
        private int weight;

        public PlaneBuilder(String name) {
            this.name = name;
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

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
