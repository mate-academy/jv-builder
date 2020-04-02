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
    private PlaneBuilder planeBuilder;

    private Plane(String planeModel, String planeEngineType, int planeSize, int planeSpeed, PlaneBuilder planeBuilder) {
        this.planeModel = planeModel;
        this.planeEngineType = planeEngineType;
        this.planeSpeed = planeSpeed;
        this.planeBuilder = planeBuilder;
        this.planeBuilder = planeBuilder;
    }

    public class PlaneBuilder {
        public PlaneBuilder setPlaneModel(String planeModel) {

            Plane.this.planeModel = planeModel;

            return this;
        }

        public PlaneBuilder setPlaneEngineType(String planeEngineType) {
            Plane.this.planeEngineType = planeEngineType;

            return this;
        }

        public PlaneBuilder setPlaneSize(int planeSize) {
            Plane.this.planeSize = planeSize;

            return this;
        }

        public PlaneBuilder setPlaneSpeed(int planeSpeed) {
            Plane.this.planeSpeed = planeSpeed;

            return this;
        }

        public PlaneBuilder setPlaneBuilder(PlaneBuilder planeBuilder) {
            Plane.this.planeBuilder = planeBuilder;

            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
