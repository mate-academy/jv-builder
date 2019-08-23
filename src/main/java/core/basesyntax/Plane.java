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

    private Plane(Builder builder) {
        this.name = name;
        this.color = color;
        this.engineType = engineType;
        this.passengerCap = passengerCap;
        this.numberOfWings = numberOfWings;
    }

    static class Builder {
        private String name;
        private String color;
        private String engineType;
        private int passengerCap;
        private int numberOfWings;

        public Builder(String name) {
            this.name = name;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder setPassengerCap(int passengerCap) {
            this.passengerCap = passengerCap;
            return this;
        }

        public Builder setNumberOfWings(int numberOfWings) {
            this.numberOfWings = numberOfWings;
            return this;
        }

        public Plane built() {
            return new Plane(this);
        }
    }
}
