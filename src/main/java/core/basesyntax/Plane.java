package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private String colour;
    private String country;
    private int maxSpeed;
    private int maxWeight;
    private int yearBuild;

    public Plane(String name, String colour, String country, int maxSpeed,
                 int maxWeight, int yearBuild) {
        this.name = name;
        this.colour = colour;
        this.country = country;
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
        this.yearBuild = yearBuild;
    }

    public static class PlaneBuilder {
        private String name;
        private String country;
        private String colour;
        private int maxSpeed;
        private int maxWeight;
        private int yearBuild;

        public PlaneBuilder() {

        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxWeight(int maxWeight) {
            this.maxWeight = maxWeight;
            return this;
        }

        public PlaneBuilder setYearBuild(int yearBuild) {
            this.yearBuild = yearBuild;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    private Plane(PlaneBuilder builder) {
        name = builder.name;
        colour = builder.colour;
        country = builder.country;
        maxSpeed = builder.maxSpeed;
        maxWeight = builder.maxWeight;
        yearBuild = builder.yearBuild;
    }

}
