package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String markName;
    private int maxSpeed;
    private int maxFlyRange;
    private int weight;
    private boolean isBeautiful;

    public Plane(String markName, int maxSpeed, int maxFlyRange, int weight, boolean isBeautiful) {
        this.markName = markName;
        this.maxSpeed = maxSpeed;
        this.maxFlyRange = maxFlyRange;
        this.weight = weight;
        this.isBeautiful = isBeautiful;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.markName = planeBuilder.markName;
        this.maxFlyRange = planeBuilder.maxFlyRange;
        this.weight = planeBuilder.weight;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.isBeautiful = planeBuilder.isBeautiful;
    }

    public static class PlaneBuilder {
        private String markName;
        private int maxSpeed;
        private int maxFlyRange;
        private int weight;
        private boolean isBeautiful;

        public PlaneBuilder setMarkName(String markName) {
            this.markName = markName;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setMaxFlyRange(int maxFlyRange) {
            this.maxFlyRange = maxFlyRange;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setIsBeautiful(boolean beautiful) {
            isBeautiful = beautiful;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}

