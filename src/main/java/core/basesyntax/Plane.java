package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String manufacturer;
    private String model;
    private int boardNumber;
    private int passengerCapacity;
    private int yearOfManufacturing;

    private Plane(PlaneBuilder builder) {
        this.manufacturer = builder.manufacturer;
        this.model = builder.model;
        this.boardNumber = builder.boardNumber;
        this.passengerCapacity = builder.passengerCapacity;
        this.yearOfManufacturing = builder.yearOfManufacturing;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getBoardNumber() {
        return boardNumber;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public static class PlaneBuilder {
        private String manufacturer;
        private String model;
        private int boardNumber;
        private int passengerCapacity;
        private int yearOfManufacturing;

        public PlaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;

            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;

            return this;
        }

        public PlaneBuilder setBoardNumber(int boardNumber) {
            this.boardNumber = boardNumber;

            return this;
        }

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;

            return this;
        }

        public PlaneBuilder setYearOfManufacturing(int yearOfManufacturing) {
            this.yearOfManufacturing = yearOfManufacturing;

            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
