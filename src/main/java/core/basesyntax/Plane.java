package core.basesyntax;

public class Plane {
    private String model;
    private float weight;
    private float weightCapacity;
    private int peopleCapacity;
    private int crewSize;
    private int year;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.weight = builder.weight;
        this.weightCapacity = builder.weightCapacity;
        this.peopleCapacity = builder.peopleCapacity;
        this.crewSize = builder.crewSize;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", weight=" + weight
                + ", weightCapacity=" + weightCapacity
                + ", peopleCapacity=" + peopleCapacity
                + ", crewSize=" + crewSize
                + ", year=" + year
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private float weight;
        private float weightCapacity;
        private int peopleCapacity;
        private int crewSize;
        private int year;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setWeight(float weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setWeightCapacity(float weightCapacity) {
            this.weightCapacity = weightCapacity;
            return this;
        }

        public PlaneBuilder setPeopleCapacity(int peopleCapacity) {
            this.peopleCapacity = peopleCapacity;
            return this;
        }

        public PlaneBuilder setCrewSize(int crewSize) {
            this.crewSize = crewSize;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
