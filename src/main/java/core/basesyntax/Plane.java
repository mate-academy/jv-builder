package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plane. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String color;
    private String type;
    private int maxSpeed;
    private boolean weapon;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.type = planeBuilder.type;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.weapon = planeBuilder.weapon;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private String type;
        private int maxSpeed;
        private boolean weapon;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setWeapon(boolean weapon) {
            this.weapon = weapon;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
