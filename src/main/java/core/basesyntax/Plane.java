package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private final String name;
    private final String title;
    private final int takeoffWeight;
    private final int engine;
    private final int numberOfSeats;

    private Plane(PlaneBuilder newPlan) {
        this.name = newPlan.name;
        this.title = newPlan.title;
        this.takeoffWeight = newPlan.takeoffWeight;
        this.engine = newPlan.engine;
        this.numberOfSeats = newPlan.numberOfSeats;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getTakeoffWeight() {
        return takeoffWeight;
    }

    public int getEngine() {
        return engine;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public static class PlaneBuilder {
        private String name;
        private String title;
        private int takeoffWeight;
        private int engine;
        private int numberOfSeats;

        public PlaneBuilder() {
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public PlaneBuilder setTakeoffWeight(int takeoffWeight) {
            this.takeoffWeight = takeoffWeight;
            return this;
        }

        public PlaneBuilder setEngine(int engine) {
            this.engine = engine;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
