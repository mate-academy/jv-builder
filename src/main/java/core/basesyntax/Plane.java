package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String modelName;
    private String type;
    private Double planeLength;
    private String countryOfProducing;
    private boolean isNewestModel;

    private Plane(PlaneBuilder plainBuilder) {
        this.modelName = plainBuilder.modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public String getType() {
        return type;
    }

    public Double getPlaneLength() {
        return planeLength;
    }

    public String getCountryOfProducing() {
        return countryOfProducing;
    }

    public boolean isNewestModel() {
        return isNewestModel;
    }

    public static class PlaneBuilder {
        private String modelName;
        private String type;
        private Double planeLength;
        private String countryOfProducing;
        private boolean isNewestModel;

        private PlaneBuilder(String modelName) {
            this.modelName = modelName;
        }

        public PlaneBuilder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setPlaneLength(double planeLength) {
            this.planeLength = planeLength;
            return this;
        }

        public PlaneBuilder setCountryOfProducing(String countryOfProducing) {
            this.countryOfProducing = countryOfProducing;
            return this;
        }

        public PlaneBuilder setIsNewestModel(boolean isNewestModel) {
            this.isNewestModel = isNewestModel;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
