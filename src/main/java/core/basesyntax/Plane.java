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
    }

    public class PlaneBuilder {

        private PlaneBuilder() {
        }

        public PlaneBuilder setModel(String model) {
            Plane.this.model = model;
            return this;
        }

        public PlaneBuilder setPilotName(String pilotName) {
            Plane.this.pilotName = pilotName;
            return this;
        }

        public PlaneBuilder setYearBuilt(int yearBuilt) {
            Plane.this.yearBuilt = yearBuilt;
            return this;
        }

        public PlaneBuilder setMaxNumberOfPassengers(int maxNumberOfPassengers) {
            Plane.this.maxNumberOfPassengers = maxNumberOfPassengers;
            return this;
        }

        public PlaneBuilder setBrokeDownBefore(boolean brokeDownBefore) {
            Plane.this.brokeDownBefore = brokeDownBefore;
            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
