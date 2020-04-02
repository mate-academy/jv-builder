package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String company;
    private String model;
    private int weight;
    private int averageSpeed;
    private int places;

    private Plane(PlaneBuilder builder) {
        this.company = builder.company;
        this.model = builder.model;
        this.weight = builder.weight;
        this.averageSpeed = builder.averageSpeed;
        this.places = builder.places;
    }

    public String getCompany() {    
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }

    public int getPlaces() {
        return places;
    }

    public static class PlaneBuilder {
        private String company;
        private String model;
        private int weight;
        private int averageSpeed;
        private int places;

        public PlaneBuilder(String model) {
            this.model = model;
        }

        public PlaneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setAverageSpeed(int averageSpeed) {
            this.averageSpeed = averageSpeed;
            return this;
        }

        public PlaneBuilder setPlaces(int places) {
            this.places = places;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
