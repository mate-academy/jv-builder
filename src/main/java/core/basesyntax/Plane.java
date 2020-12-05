package core.basesyntax;

public class Plane {
    private String name;
    private String model;
    private int yearBuild;
    private double engineHorsePower;
    private int passengersCapacity;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.yearBuild = builder.yearBuild;
        this.engineHorsePower = builder.engineHorsePower;
        this.passengersCapacity = builder.passengersCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" + "name='" + name + '\''
                + ", model='" + model + '\''
                + ", yearBuild=" + yearBuild
                + ", engineHorsePower=" + engineHorsePower
                + ", passengersCapacity=" + passengersCapacity
                + '}';
    }

    public static class PlaneBuilder {
        private String name;
        private String model;
        private int yearBuild;
        private double engineHorsePower;
        private int passengersCapacity;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setYearBuild(int yearBuild) {
            this.yearBuild = yearBuild;
            return this;
        }

        public PlaneBuilder setEngineHorsePower(double engineHorsePower) {
            this.engineHorsePower = engineHorsePower;
            return this;
        }

        public PlaneBuilder setPassengersCapacity(int passengersCapacity) {
            this.passengersCapacity = passengersCapacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
