package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String nameOfPlane;
    private int howHigh;
    private int speed;
    private int numberOfSeats;
    private int flightRange;

    public Plane(String nameOfPlane, int howHigh, int speed,
            int numberOfSeats, int flightRange) {
        this.nameOfPlane = nameOfPlane;
        this.howHigh = howHigh;
        this.speed = speed;
        this.numberOfSeats = numberOfSeats;
        this.flightRange = flightRange;
    }

    private Plane(PlaneBuilder builder) {
        this.nameOfPlane = builder.nameOfPlane;
        this.howHigh = builder.howHigh;
        this.speed = builder.speed;
        this.numberOfSeats = builder.numberOfSeats;
        this.flightRange = builder.flightRange;
    }

    public String getNameOfPlane() {
        return nameOfPlane;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getFlightRange() {
        return flightRange;
    }

    public int getHowHigh() {
        return howHigh;
    }

    public static class PlaneBuilder {
        private String nameOfPlane;
        private int howHigh;
        private int speed;
        private int numberOfSeats;
        private int flightRange;

        public PlaneBuilder setNameOfPlane(String nameOfPlane) {
            this.nameOfPlane = nameOfPlane;
            return this;
        }

        public PlaneBuilder setHowHigh(int howHigh) {
            this.howHigh = howHigh;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public PlaneBuilder setFlightRange(int flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}