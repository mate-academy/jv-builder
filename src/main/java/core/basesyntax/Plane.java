package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String bodyMaterial;
    private double wingspan;
    private double length;
    private String engineType;
    private String modelType;

    private Plane(PlaneBuilder builder) {
        this.bodyMaterial = builder.bodyMaterial;
        this.wingspan = builder.wingspan;
        this.length = builder.length;
        this.engineType = builder.engineType;
        this.modelType = builder.modelType;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public double getWingspan() {
        return wingspan;
    }

    public double getLength() {
        return length;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getModelType() {
        return modelType;
    }

    @Override
    public String toString() {
        return String.format("Plane{modelType=%s, wingspan=%f,"
                        + " length=%f, engine=%s, material=%s}",
                modelType, wingspan, length, engineType, bodyMaterial);
    }

    public static class PlaneBuilder {
        private String bodyMaterial;
        private double wingspan;
        private double length;
        private String engineType;
        private String modelType;

        public PlaneBuilder() {
        }

        public PlaneBuilder setBodyMaterial(String bodyMaterial) {
            this.bodyMaterial = bodyMaterial;
            return this;
        }

        public PlaneBuilder setWingspan(double wingspan) {
            this.wingspan = wingspan;
            return this;
        }

        public PlaneBuilder setLength(double length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public PlaneBuilder setModelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        public static PlaneBuilder getPlaneBuilder() {
            return new PlaneBuilder();
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
