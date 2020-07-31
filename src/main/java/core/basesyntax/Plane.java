package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String manufacturingCompany;
    private int flightCeiling;
    private boolean isMilitary;
    private int maxSpeed;
    private int numberOfPassengers;

    private Plane(PlaneBuilder builder) {
        this.manufacturingCompany = builder.manufacturingCompany;
        this.flightCeiling = builder.flightCeiling;
        this.isMilitary = builder.isMilitary;
        this.maxSpeed = builder.maxSpeed;
        this.numberOfPassengers = builder.numberOfPassengers;
    }

    public int getFlightCeiling() {
        return flightCeiling;
    }

    public boolean getIsMilitary() {
        return isMilitary;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public static class PlaneBuilder {
        private String manufacturingCompany;
        private int flightCeiling;
        private boolean isMilitary;
        private int maxSpeed;
        private int numberOfPassengers;

        public PlaneBuilder setManufacturingCompany(String manufacturingCompany) {
            this.manufacturingCompany = manufacturingCompany;
            return this;
        }

        public PlaneBuilder setFlightCeiling(int flightCeiling) {
            this.flightCeiling = flightCeiling;
            return this;
        }

        public PlaneBuilder setIsMilitary(boolean isMilitary) {
            this.isMilitary = isMilitary;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
