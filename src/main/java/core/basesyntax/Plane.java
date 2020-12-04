package core.basesyntax;

public class Plane {
    private String model;
    private String colour;
    private int year;
    private String engineType;
    private String usageType;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.colour = builder.colour;
        this.year = builder.year;
        this.engineType = builder.engineType;
        this.usageType = builder.usageType;
    }

    public static class PlaneBuilder {
        private String model;
        private String colour;
        private int year;
        private String engineType;
        private String usageType;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public PlaneBuilder setUsageType(String usageType) {
            this.usageType = usageType;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Plane: Model: " + model
                + " , - Colour: " + colour
                + " , - Year: " + year
                + " , - Engine type: " + engineType
                + " , - Usage type: " + usageType + ".";
    }
}
