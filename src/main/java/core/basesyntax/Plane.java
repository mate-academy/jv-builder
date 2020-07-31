package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс Builder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String planeType;
    private int numberOfPassengers;
    private String yearOfProduction;
    private String whichAirlines;
    private int code;

    private Plane(Builder builder) {
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

    public static class Builder {
        private Plane plane;

        public Builder() {
            plane = new Plane(this);
        }

        public Builder setPlaneType(String planeType) {
            plane.planeType = planeType;
            return this;
        }

        public Builder setNumberOfPassengers(int numberOfPassengers) {
            plane.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public Builder setYearOfProduction(String yearOfProduction) {
            plane.yearOfProduction = yearOfProduction;
            return this;
        }

        public Builder setWhichAirlines(String whichAirlines) {
            plane.whichAirlines = whichAirlines;
            return this;
        }

        public Builder setCode(int code) {
            plane.code = code;
            return this;
        }

        public Plane build() {
            return plane;
        }
    }
}
