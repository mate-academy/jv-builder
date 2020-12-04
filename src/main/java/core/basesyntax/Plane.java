package core.basesyntax;

public class Plane {

    private final String name;
    private final String model;
    private final boolean isAirliner;
    private final int numberOfSits;
    private final int numberOfEngines;
    private final int enginePower;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.model = planeBuilder.model;
        this.isAirliner = planeBuilder.isAirliner;
        this.numberOfSits = planeBuilder.numberOfSits;
        this.numberOfEngines = planeBuilder.numberOfEngines;
        this.enginePower = planeBuilder.enginePower;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "name='" + name + '\''
                + ", model='" + model + '\''
                + ", isAirliner=" + isAirliner
                + ", numberOfSits=" + numberOfSits
                + ", numberOfEngines=" + numberOfEngines
                + ", enginePower=" + enginePower + '}';
    }

    public static class PlaneBuilder {

        private String name;
        private String model;
        private boolean isAirliner;
        private int numberOfSits;
        private int numberOfEngines;
        private int enginePower;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setIsAirliner(boolean airliner) {
            this.isAirliner = airliner;
            return this;
        }

        public PlaneBuilder setNumberOfSits(int numberOfSits) {
            this.numberOfSits = numberOfSits;
            return this;
        }

        public PlaneBuilder setNumberOfEngines(int numberOfEngines) {
            this.numberOfEngines = numberOfEngines;
            return this;
        }

        public PlaneBuilder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
