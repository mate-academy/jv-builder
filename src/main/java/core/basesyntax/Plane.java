package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String planeName;
    private int planeLength;
    private int planeWeight;
    private int planeCapacity;
    private int planeYear;

    private Plane(PlaneBuilder planeBuilder) {
        this.planeName = planeBuilder.planeName;
    }

    public String getPlaneName() {
        return planeName;
    }

    public int getPlaneLength() {
        return planeLength;
    }

    public int getPlaneWeight() {
        return planeWeight;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public int getPlaneYear() {
        return planeYear;
    }

    public static class PlaneBuilder {

        private String planeName;
        private int planeLength;
        private int planeWeight;
        private int planeCapacity;
        private int planeYear;

        public PlaneBuilder setPlaneName(String planeName) {
            this.planeName = planeName;
            return this;
        }

        public PlaneBuilder setPlaneLength(int planeLength) {
            this.planeLength = planeLength;
            return this;
        }

        public PlaneBuilder setPlaneWeight(int planeWeight) {
            this.planeWeight = planeWeight;
            return this;
        }

        public PlaneBuilder setPlaneCapacity(int planeCapacity) {
            this.planeCapacity = planeCapacity;
            return this;
        }

        public PlaneBuilder setPlaneYear(int planeYear) {
            this.planeYear = planeYear;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
