package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private int seats;
    private int wheels;
    private int wings;
    private int engines;
    private int windows;

    public Plane(PlaneBuilder planeBuilder) {
        name = planeBuilder.name;
        seats = planeBuilder.seats;
        wheels = planeBuilder.wheels;
        wings = planeBuilder.wings;
        engines = planeBuilder.engines;
        windows = planeBuilder.windows;
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWings() {
        return wings;
    }

    public int getEngines() {
        return engines;
    }

    public int getWindows() {
        return windows;
    }

    public static class PlaneBuilder {
        private String name;
        private int seats;
        private int wheels;
        private int wings;
        private int engines;
        private int windows;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public PlaneBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public PlaneBuilder setWings(int wings) {
            this.wings = wings;
            return this;
        }

        public PlaneBuilder setEngines(int engines) {
            this.engines = engines;
            return this;
        }

        public PlaneBuilder setWindows(int wind) {
            this.windows = windows;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane{"
                + "name='" + name + '\''
                + ", seats=" + seats
                + ", wheels=" + wheels
                + ", wings=" + wings
                + ", engines=" + engines
                + ", windows=" + windows
                + '}';
    }
}
