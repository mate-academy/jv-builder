package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String planeModel;
    private String planeEngineType;
    private int planeSize;
    private int planeSpeed;
    private String planeColor;

    private Plane(PlaneBuilder planeBuilder) {
        this.planeModel = planeBuilder.planeModel;
    }

    public class PlaneBuilder {

        private String planeModel;
        private String planeEngineType;
        private int planeSize;
        private int planeSpeed;
        private String planeColor;

        public PlaneBuilder setPlaneModel(String planeModel) {
            this.planeModel = planeModel;
            this.planeEngineType = planeEngineType;
            this.planeSize = planeSize;
            this.planeSpeed = planeSpeed;
            return this;
        }

        public PlaneBuilder setPlaneEngineType(String planeEngineType) {
            this.planeEngineType = planeEngineType;
            return this;
        }

        public PlaneBuilder setPlaneSize(int planeSize) {
            this.planeSize = planeSize;
            return this;
        }

        public PlaneBuilder setPlaneSpeed(int planeSpeed) {
            this.planeSpeed = planeSpeed;
            return this;
        }

        public PlaneBuilder setPlaneColor(String planeColor) {
            this.planeColor = planeColor;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
