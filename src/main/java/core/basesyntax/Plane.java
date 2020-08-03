package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String model;
    private int wingsNumber;
    private double wingsLength;
    private int passengerSeats;
    private boolean swimAbility;
    private int pilotsNumber;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.swimAbility = builder.swimAbility;
        this.pilotsNumber = builder.pilotsNumber;
        this.passengerSeats = builder.passengerSeats;
        this.wingsLength = builder.wingsLength;
        this.wingsNumber = builder.wingsNumber;
    }

    public class PlaneBuilder {

        private String model;
        private int wingsNumber;
        private double wingsLength;
        private int passengerSeats;
        private boolean swimAbility;
        private int pilotsNumber;

        public PlaneBuilder() {

        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setWingsNumber(int wingsNumber) {
            this.wingsNumber = wingsNumber;
            return this;
        }

        public PlaneBuilder setWingsLength(double wingsLength) {
            this.wingsLength = wingsLength;
            return this;
        }

        public PlaneBuilder setPassengerSeats(int passengerSeats) {
            this.passengerSeats = passengerSeats;
            return this;
        }

        public PlaneBuilder setSwimAbility(boolean swimAbility) {
            this.swimAbility = swimAbility;
            return this;
        }

        public PlaneBuilder setPilotsNumber(int pilotsNumber) {
            this.pilotsNumber = pilotsNumber;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
