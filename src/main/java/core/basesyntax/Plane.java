package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int numberOfPlaces;
    private int cruisingSpeed;
    private int rangeOfFlight;
    private int maximumWeight;
    private String course;

    private Plane(PlaneBuilder planeBuilder) {
        this.numberOfPlaces = planeBuilder.numberOfPlaces;
        this.cruisingSpeed = planeBuilder.cruisingSpeed;
        this.rangeOfFlight = planeBuilder.rangeOfFlight;
        this.maximumWeight = planeBuilder.maximumWeight;
        this.course = planeBuilder.course;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public int getRangeOfFlight() {
        return rangeOfFlight;
    }

    public int getMaximumWeight() {
        return maximumWeight;
    }

    public String getCourse() {
        return course;
    }

    public static class PlaneBuilder {
        private int numberOfPlaces;
        private int cruisingSpeed;
        private int rangeOfFlight;
        private int maximumWeight;
        private String course;

        public PlaneBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public PlaneBuilder setNumberOfPlaces(int numberOfPlaces) {
            this.numberOfPlaces = numberOfPlaces;
            return this;
        }

        public PlaneBuilder setCruisingSpeed(int cruisingSpeed) {
            this.cruisingSpeed = cruisingSpeed;
            return this;
        }

        public PlaneBuilder setRangeOfFlight(int rangeOfFlight) {
            this.rangeOfFlight = rangeOfFlight;
            return this;
        }

        public PlaneBuilder setMaximumWeight(int maximumWeight) {
            this.maximumWeight = maximumWeight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}

