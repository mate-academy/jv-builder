package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует
 * паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые
 * изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public final class Plane {
    private String model;
    private String pilotName;
    private int yearBuilt;
    private int maxNumberOfPassengers;
    private boolean brokeDownBefore;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.pilotName = builder.pilotName;
        this.yearBuilt = builder.yearBuilt;
        this.maxNumberOfPassengers = builder.maxNumberOfPassengers;
        this.brokeDownBefore = builder.brokeDownBefore;
    }

    public static class PlaneBuilder {
        private String model;
        private String pilotName;
        private int yearBuilt;
        private int maxNumberOfPassengers;
        private boolean brokeDownBefore;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            ;
            return this;
        }

        public PlaneBuilder setPilotName(String pilotName) {
            this.pilotName = pilotName;
            return this;
        }

        public PlaneBuilder setYearBuilt(int yearBuilt) {
            this.yearBuilt = yearBuilt;
            return this;
        }

        public PlaneBuilder setMaxNumberOfPassengers(int maxNumberOfPassengers) {
            this.maxNumberOfPassengers = maxNumberOfPassengers;
            return this;
        }

        public PlaneBuilder setBrokeDownBefore(boolean brokeDownBefore) {
            this.brokeDownBefore = brokeDownBefore;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
