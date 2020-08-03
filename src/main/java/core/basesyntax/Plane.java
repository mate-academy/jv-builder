package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн PlaneBuilder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна PlaneBuilder.</p>
 */

public class Plane {
    private String planeType;
    private int numberOfPassengers;
    private String yearOfProduction;
    private String whichAirlines;
    private int code;

    private Plane(PlaneBuilder planeBuilder) {
        this.planeType = planeBuilder.planeType;
        this.numberOfPassengers = planeBuilder.numberOfPassengers;
        this.yearOfProduction = planeBuilder.yearOfProduction;
        this.whichAirlines = planeBuilder.whichAirlines;
        this.code = planeBuilder.code;
    }

    public String getPlaneType() {
        return planeType;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public String getYearOfProduction() {
        return yearOfProduction;
    }

    public String getWhichAirlines() {
        return whichAirlines;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Plane {"
                + "planeType= " + planeType + ", numberOfPassengers= " + numberOfPassengers
                + ", yearOfProduction= " + yearOfProduction + ", whichAirlines= " + whichAirlines
                + ", code=" + code + "}";
    }

    public static class PlaneBuilder {
        private String planeType;
        private int numberOfPassengers;
        private String yearOfProduction;
        private String whichAirlines;
        private int code;

        public PlaneBuilder setPlaneType(String planeType) {
            this.planeType = planeType;
            return this;
        }

        public PlaneBuilder setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public PlaneBuilder setYearOfProduction(String yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public PlaneBuilder setWhichAirlines(String whichAirlines) {
            this.whichAirlines = whichAirlines;
            return this;
        }

        public PlaneBuilder setCode(int code) {
            this.code = code;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
