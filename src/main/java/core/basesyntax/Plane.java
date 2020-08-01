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

    private Plane(PlaneBuilder planeBuilder) {

    }

    public class PlaneBuilder {

        private PlaneBuilder() {

        }

        public PlaneBuilder setModel(String model) {
            Plane.this.model = model;
            return this;
        }

        public PlaneBuilder setWingsNumber(int wingsNumber) {
            Plane.this.wingsNumber = wingsNumber;
            return this;
        }

        public PlaneBuilder setWingsLength(double wingsLength) {
            Plane.this.wingsLength = wingsLength;
            return this;
        }

        public PlaneBuilder setPassengerSeats(int passengerSeats) {
            Plane.this.passengerSeats = passengerSeats;
            return this;
        }

        public PlaneBuilder setSwimAbility(boolean swimAbility) {
            Plane.this.swimAbility = swimAbility;
            return this;
        }

        public PlaneBuilder setPilotsNumber(int pilotsNumber) {
            Plane.this.pilotsNumber = pilotsNumber;
            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
