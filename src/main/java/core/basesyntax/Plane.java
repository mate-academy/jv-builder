package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private final String brand;
    private final String model;
    private final int passengersCapacity;
    private final int crewCount;
    private final int takeOffWeightTon;

    private Plane(PlaneBuilder planeBuilder) {
        brand = planeBuilder.brand;
        model = planeBuilder.model;
        passengersCapacity = planeBuilder.passengersCapacity;
        crewCount = planeBuilder.crewCount;
        takeOffWeightTon = planeBuilder.takeOffWeightTon;
    }

    @Override
    public String toString() {
        return "'" + brand + '\''
                + ", model='" + model + '\''
                + ", passengersCapacity=" + passengersCapacity
                + ", crewCount=" + crewCount
                + ", takeOffWeightTon=" + takeOffWeightTon
                + '}';
    }

    public static class PlaneBuilder {
        private String brand;
        private String model;
        private int passengersCapacity;
        private int crewCount;
        private int takeOffWeightTon;

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setPassengersCapacity(int passengersCapacity) {
            this.passengersCapacity = passengersCapacity;
            return this;
        }

        public PlaneBuilder setCrewCount(int crewCount) {
            this.crewCount = crewCount;
            return this;
        }

        public PlaneBuilder setTakeOffWeightTon(int takeOffWeightTon) {
            this.takeOffWeightTon = takeOffWeightTon;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
