package core.basesyntax;

public class Plane {
    private final int year;
    private final int numberOfEngines;
    private final int range;
    private final int numberOfPassengers;
    private final String name;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.numberOfEngines = builder.numberOfEngines;
        this.year = builder.year;
        this.range = builder.range;
        this.numberOfPassengers = builder.numberOfPassengers;
    }

    public String toString(){
        return new StringBuilder("Plane model: ").append(name).append(", release year: ")
                .append(year).append(", number of engines: ").append(numberOfEngines)
                .append(", flying range (in km): ").append(range).append(", number of passengers: ")
                .append(numberOfPassengers).toString();

    }

    public static class PlaneBuilder {
        private int year;
        private int numberOfEngines;
        private int range;
        private int numberOfPassengers;
        private String name;

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setNumberOfEngines(int numberOfEngines) {
            this.numberOfEngines = numberOfEngines;
            return this;
        }

        public PlaneBuilder setRange(int range) {
            this.range = range;
            return this;
        }

        public PlaneBuilder setNumberOfPassengers(int numberOfPassengers) {
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
