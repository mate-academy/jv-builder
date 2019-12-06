package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String id;
    private int seatsNumber;
    private int enginesNumber;
    private boolean isReadyForFlight;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.id = planeBuilder.id;
        this.seatsNumber = planeBuilder.seatsNumber;
        this.enginesNumber = planeBuilder.enginesNumber;
        this.isReadyForFlight = planeBuilder.isReadyForFlight;
    }

    public Plane(String model, String id, int seatsNumber,
                 int enginesNumber, boolean isReadyForFlight) {
        this.model = model;
        this.id = id;
        this.seatsNumber = seatsNumber;
        this.enginesNumber = enginesNumber;
        this.isReadyForFlight = isReadyForFlight;
    }

    public static class PlaneBuilder {
        private String model;
        private String id;
        private int seatsNumber;
        private int enginesNumber;
        private boolean isReadyForFlight;

        public PlaneBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setIsReadyForFlight(boolean readyForFlight) {
            isReadyForFlight = readyForFlight;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setSeatsNumber(int seatsNumber) {
            this.seatsNumber = seatsNumber;
            return this;
        }

        public PlaneBuilder setEnginesNumber(int enginesNumber) {
            this.enginesNumber = enginesNumber;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
