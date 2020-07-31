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
        private Plane plane;

        public PlaneBuilder() {
            plane = new Plane(this);
        }

        public PlaneBuilder setPlaneType(String planeType) {
            plane.planeType = planeType;
            return this;
        }

        public PlaneBuilder setNumberOfPassengers(int numberOfPassengers) {
            plane.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public PlaneBuilder setYearOfProduction(String yearOfProduction) {
            plane.yearOfProduction = yearOfProduction;
            return this;
        }

        public PlaneBuilder setWhichAirlines(String whichAirlines) {
            plane.whichAirlines = whichAirlines;
            return this;
        }

        public PlaneBuilder setCode(int code) {
            plane.code = code;
            return this;
        }

        public Plane build() {
            return plane;
        }
    }
}
