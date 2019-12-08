package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String model;
    private int engineCapacity;
    private int passengerCapacity;
    private int tankVolume;

    public Plane(String name, String model, int engineCapacity,
                 int passengerCapacity, int tankVolume) {
        this.name = name;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.passengerCapacity = passengerCapacity;
        this.tankVolume = tankVolume;
    }

    private Plane(PlaneBuilder builder) {
        this.name = name;
        this.model = model;
        this.engineCapacity = engineCapacity;
        this.passengerCapacity = passengerCapacity;
        this.tankVolume = tankVolume;
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private int engineCapacity;
        private int passengerCapacity;
        private int tankVolume;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public PlaneBuilder setTankVolume(int tankVolume) {
            this.tankVolume = tankVolume;
            return this;
        }

        public PlaneBuilder setEngineCapacity(int engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}

