package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String planeModel;
    private int planeSpeed;
    private int planeWeight;
    private int enginePower;
    private String planeClassification;

    private Plane(PlaneBuilder builder) {
        this.planeModel = builder.planeModel;
        this.planeSpeed = builder.planeSpeed;
        this.planeWeight = builder.planeWeight;
        this.enginePower = builder.enginePower;
        this.planeClassification = builder.planeClassification;
    }

    public static class PlaneBuilder {
        private String planeModel;
        private int planeSpeed;
        private int planeWeight;
        private int enginePower;
        private String planeClassification;

        public PlaneBuilder setPlaneModel(String planeModel) {
            this.planeModel = planeModel;
            return this;
        }

        public PlaneBuilder setPlaneSpeed(int planeSpeed) {
            this.planeSpeed = planeSpeed;
            return this;
        }

        public PlaneBuilder setPlaneWeight(int planeWeight) {
            this.planeWeight = planeWeight;
            return this;
        }

        public PlaneBuilder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public PlaneBuilder setPlaneClassification(String planeClassification) {
            this.planeClassification = planeClassification;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}

