package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изменения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private final long id;
    private int amountOfEngines = 3;
    private String name;
    private int takeoffWeight;
    private int speed;
    private String landingType = "land";

    private Plane(PlaneBuilder planeBuilder) {
        id = planeBuilder.id;
        amountOfEngines = planeBuilder.amountOfEngines;
        name = planeBuilder.name;
        takeoffWeight = planeBuilder.takeoffWeight;
        speed = planeBuilder.speed;
        landingType = planeBuilder.landingType;
    }

    public long getId() {
        return id;
    }

    public int getAmountOfEngines() {
        return amountOfEngines;
    }

    public String getName() {
        return name;
    }

    public int getTakeoffWeight() {
        return takeoffWeight;
    }

    public int getSpeed() {
        return speed;
    }

    public String getLandingType() {
        return landingType;
    }

    public static class PlaneBuilder {
        private long id;
        private int amountOfEngines = 3;
        private String name;
        private int takeoffWeight;
        private int speed;
        private String landingType;

        public PlaneBuilder(long id) {
            this.id = id;
        }

        public PlaneBuilder setAmountOfEngines(int amountOfEngines) {
            this.amountOfEngines = amountOfEngines;

            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;

            return this;
        }

        public PlaneBuilder setTakeoffWeight(int takeoffWeight) {
            this.takeoffWeight = takeoffWeight;

            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;

            return this;
        }

        public PlaneBuilder setLandingType(String landingType) {
            this.landingType = landingType;

            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
