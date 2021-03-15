package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int placeCount;
    private double engineVolume;
    private String firm;

    public Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.placeCount = builder.placeCount;
        this.engineVolume = builder.engineVolume;
        this.firm = builder.firm;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "model='" + model + '\''
                + ", color='" + color + '\''
                + ", placeCount=" + placeCount
                + ", engineVolume=" + engineVolume
                + ", firm='" + firm + '\''
                + '}';
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int placeCount;
        private double engineVolume;
        private String firm;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setPlaceCount(int placeCount) {
            this.placeCount = placeCount;
            return this;
        }

        public PlaneBuilder setEngineVolume(double engineVolume) {
            this.engineVolume = engineVolume;
            return this;
        }

        public PlaneBuilder setFirm(String firm) {
            this.firm = firm;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
