package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public final class Plane {
    private String name;
    private String color;
    private String model;
    private int maxSpeed;
    private int age;

    public Plane(String name, String color, String model, int maxSpeed, int age) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.age = age;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.color = planeBuilder.color;
        this.model = planeBuilder.model;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.age = planeBuilder.age;
    }

    @Override
    public String toString() {
        return "Plane{" + "name = " + name + ", color = " + color + "model = "
                + model + " maxSpeed = " + maxSpeed + "age = " + age + '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int age() {
        return age;
    }

    public static class PlaneBuilder {
        private String name;
        private String color;
        private String model;
        private int maxSpeed;
        private int age;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
