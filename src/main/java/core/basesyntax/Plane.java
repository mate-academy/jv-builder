package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String color;
    private int speed;
    private int wing;
    private int engineVolume;
    private int length;

    private Plane(PlaneBuilder builder) {
        this.color = builder.color;
        this.speed = builder.speed;
        this.wing = builder.wing;
        this.engineVolume = builder.engineVolume;
        this.length = builder.length;
    }

    public static class PlaneBuilder {
        private String color;
        private int speed;
        private int wing;
        private int engineVolume;
        private int length;

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setWing(int wing) {
            this.wing = wing;
            return this;
        }

        public PlaneBuilder setEngineVolume(int engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}

