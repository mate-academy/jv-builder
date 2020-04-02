package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int wings;
    private int engine;
    private int seat;
    private int bathroom;
    private String color;

    private Plane(PlaneBuilder builder) {
        this.wings = builder.wings;
        this.engine = builder.engine;
        this.seat = builder.seat;
        this.bathroom = builder.bathroom;
        this.color = builder.color;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "wings=" + wings
                + ", engine=" + engine
                + ", seat=" + seat
                + ", bathroom=" + bathroom
                + ", color='" + color + '\'' + '}';
    }

    public int getWings() {
        return wings;
    }

    public int getEngine() {
        return engine;
    }

    public int getSeat() {
        return seat;
    }

    public int getBathroom() {
        return bathroom;
    }

    public String getColor() {
        return color;
    }

    public static class PlaneBuilder {
        private int wings;
        private int engine;
        private int seat;
        private int bathroom;
        private String color;

        public PlaneBuilder(int seat) {
            this.seat = seat;
        }

        public PlaneBuilder setWings(int wings) {
            this.wings = wings;
            return this;
        }

        public PlaneBuilder setEngine(int engine) {
            this.engine = engine;
            return this;
        }

        public PlaneBuilder setSeat(int seat) {
            this.seat = seat;
            return this;
        }

        public PlaneBuilder setBathroom(int bathroom) {
            this.bathroom = bathroom;
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
}
