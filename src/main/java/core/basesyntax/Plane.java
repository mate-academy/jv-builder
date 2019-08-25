package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна PlaneBuilder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private final String model;
    private final String type;
    private final int numberOfSeats;
    private final int maxWeightLoad;
    private final int maxFlightSpeed;

    public Plane(String model, String type, int numberOfSeats, int maxWeightLoad, int maxFlightSpeed) {
        this.model = model;
        this.type = type;
        this.numberOfSeats = numberOfSeats;
        this.maxWeightLoad = maxWeightLoad;
        this.maxFlightSpeed = maxFlightSpeed;
    }

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.type = builder.type;
        this.numberOfSeats = builder.numberOfSeats;
        this.maxWeightLoad = builder.maxWeightLoad;
        this.maxFlightSpeed = builder.maxFlightSpeed;
    }

    public static class PlaneBuilder {
        private String model;
        private String type;
        private int numberOfSeats;
        private int maxWeightLoad;
        private int maxFlightSpeed;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public PlaneBuilder setMaxWeightLoad(int maxWeightLoad) {
            this.maxWeightLoad = maxWeightLoad;
            return this;
        }

        public PlaneBuilder setMaxFlightSpeed(int maxFlightSpeed) {
            this.maxFlightSpeed = maxFlightSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
