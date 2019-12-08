package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String countryOfIssue;
    private String model;
    private int numberOfSeats;
    private int cruisingSpeed;
    private int maxFlightAltitude;

    public Plane(String countryOfIssue, String model,
                 int numberOfSeats, int cruisingSpeed, int maxFlightAltitude) {
        this.countryOfIssue = countryOfIssue;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.cruisingSpeed = cruisingSpeed;
        this.maxFlightAltitude = maxFlightAltitude;

    }

    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public int getMaxFlightAltitude() {
        return maxFlightAltitude;
    }

    public static class PlaneBuilder {

        private String countryOfIssue;
        private String model;
        private int numberOfSeats;
        private int cruisingSpeed;
        private int maxFlightAltitude;

        public PlaneBuilder setCountryOfIssue(String countryOfIssue) {

            this.countryOfIssue = countryOfIssue;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public PlaneBuilder setCruisingSpeed(int cruisingSpeed) {
            this.cruisingSpeed = cruisingSpeed;
            return this;
        }

        public PlaneBuilder setMaxFlightAltitude(int maxFlightAltitude) {
            this.maxFlightAltitude = maxFlightAltitude;
            return this;
        }

        public Plane build() {
            return new Plane(countryOfIssue, model,
                    numberOfSeats, cruisingSpeed, maxFlightAltitude);
        }
    }
}
