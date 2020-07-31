package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    
    private String name;
    private int capacity;
    private String color;
    private String guarantee;
    private int yearOfBuilding;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.capacity = planeBuilder.capacity;
        this.color = planeBuilder.color;
        this.guarantee = planeBuilder.guarantee;
        this.yearOfBuilding = planeBuilder.yearOfBuilding;
    }

    public static class PlaneBuilder {

        private String name;
        private int capacity;
        private String color;
        private String guarantee;
        private int yearOfBuilding;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setGuarantee(String guarantee) {
            this.guarantee = guarantee;
            return this;
        }

        public PlaneBuilder setYearOfBuilding(int yearOfBuilding) {
            this.yearOfBuilding = yearOfBuilding;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

}
