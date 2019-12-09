package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн PlaneBuilder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private int numberOfEngines;
    private int maxDistance;
    private String company;
    private int year;

    public Plane(String model, int numberOfEngines, int maxDistance, String company, int year) {
        this.model = model;
        this.numberOfEngines = numberOfEngines;
        this.maxDistance = maxDistance;
        this.company = company;
        this.year = year;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.model = model;
        this.numberOfEngines = numberOfEngines;
        this.maxDistance = maxDistance;
        this.company = company;
        this.year = year;
    }

    public static class PlaneBuilder {
        private String model;
        private int numberOfEngines;
        private int maxDistance;
        private String company;
        private int year;

        public PlaneBuilder(String builderName) {
        }

        public PlaneBuilder setModel(String modelToSet) {
            this.model = modelToSet;
            return this;
        }

        public PlaneBuilder setNumberOfEngines(int n) {
            this.numberOfEngines = n;
            return this;
        }

        public PlaneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public PlaneBuilder setMaxDistance(int distance) {
            this.maxDistance = distance;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
