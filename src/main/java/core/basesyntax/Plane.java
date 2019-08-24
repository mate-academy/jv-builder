package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private String color;
    private String engineType;
    private int passengerCap;
    private int numberOfWings;

    public Plane(String name, String color, String engineType,
                 int passengerCap, int numberOfWings) {
        this.name = name;
        this.color = color;
        this.engineType = engineType;
        this.passengerCap = passengerCap;
        this.numberOfWings = numberOfWings;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.color = planeBuilder.color;
        this.engineType = planeBuilder.engineType;
        this.passengerCap = planeBuilder.passengerCap;
        this.numberOfWings = planeBuilder.numberOfWings;
    }

    public static class PlaneBuilder {
        private String name;
        private String color;
        private String engineType;
        private int passengerCap;
        private int numberOfWings;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public PlaneBuilder setPassengerCap(int passengerCap) {
            this.passengerCap = passengerCap;
            return this;
        }

        public PlaneBuilder setNumberOfWings(int numberOfWings) {
            this.numberOfWings = numberOfWings;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
