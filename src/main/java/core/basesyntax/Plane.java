package core.basesyntax;

public class Plane {
    private String planeName;
    private String planeModel;
    private String planeColor;
    private int planeSpeed;
    private int planeCapacity;

    private Plane(PlaneBuilder planeBuilder) {
        this.planeName = planeBuilder.planeName;
        this.planeModel = planeBuilder.planeModel;
        this.planeColor = planeBuilder.planeColor;
        this.planeSpeed = planeBuilder.planeSpeed;
        this.planeCapacity = planeBuilder.planeCapacity;
    }

    @Override
    public String toString() {
        return "PlaneBuilder{"
                + "planeName='" + planeName + '\'' + ", planeModel='"
                + planeModel + '\'' + ", planeColor='" + planeColor
                + '\'' + ", planeSpeed=" + planeSpeed + ", planeCapacity="
                + planeCapacity + '}';
    }

    public static class PlaneBuilder {
        private String planeName;
        private String planeModel;
        private String planeColor;
        private int planeSpeed;
        private int planeCapacity;

        public PlaneBuilder setPlaneName(String planeName) {
            this.planeName = planeName;
            return this;
        }

        public PlaneBuilder setPlaneModel(String planeModel) {
            this.planeModel = planeModel;
            return this;
        }

        public PlaneBuilder setPlaneColor(String planeColor) {
            this.planeColor = planeColor;
            return this;
        }

        public PlaneBuilder setPlaneSpeed(int planeSpeed) {
            this.planeSpeed = planeSpeed;
            return this;
        }

        public PlaneBuilder setPlaneCapacity(int planeCapacity) {
            this.planeCapacity = planeCapacity;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
