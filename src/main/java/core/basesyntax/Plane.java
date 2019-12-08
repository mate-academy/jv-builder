package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String producer;
    private String codeNumber;
    private int maxSpeed;
    private int quantityPassengers;
    private boolean crashThisYear;

    public Plane(String producer, String codeNumber, int maxSpeed, int quantityPassengers,
                 boolean crashThisYear) {
        this.producer = producer;
        this.codeNumber = codeNumber;
        this.maxSpeed = maxSpeed;
        this.quantityPassengers = quantityPassengers;
        this.crashThisYear = crashThisYear;
    }

    private Plane(PlaneBuilder builder) {
        this.producer = builder.producer;
        this.codeNumber = builder.codeNumber;
        this.maxSpeed = builder.maxSpeed;
        this.quantityPassengers = builder.quantityPassengers;
        this.crashThisYear = builder.crashThisYear;
    }

    public String getProducer() {
        return producer;
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getQuantityPassengers() {
        return quantityPassengers;
    }

    public boolean getCrashThisYear() {
        return crashThisYear;
    }

    public static class PlaneBuilder {

        private String producer;
        private String codeNumber;
        private int maxSpeed;
        private int quantityPassengers;
        private boolean crashThisYear;

        public PlaneBuilder setProducer(String producer) {
            this.producer = producer;
            return this;
        }

        public PlaneBuilder setCodeNumber(String codeNumber) {
            this.codeNumber = codeNumber;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setQuantityPassengers(int quantityPassengers) {
            this.quantityPassengers = quantityPassengers;
            return this;
        }

        public PlaneBuilder setCrashThisYear(boolean crashThisYear) {
            this.crashThisYear = crashThisYear;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
