package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int planeID;
    private String planeName;
    private boolean isInAir;
    private String pilotName;
    private int gasCapacity;

    private Plane(PlaneBuilder builder) {
        this.planeName = builder.planeName;
    }

    public int getPlaneID() {
        return planeID;
    }

    public String getPlaneName() {
        return planeName;
    }

    public boolean getIsInAir() {
        return isInAir;
    }

    public String getPilotname() {
        return pilotName;
    }

    public int getGasCapacity() {
        return gasCapacity;
    }

    public static class PlaneBuilder {
        private int planeID;
        private String planeName;
        private boolean isInAir;
        private String pilotName;
        private int gasCapacity;

        private PlaneBuilder() {

        }

        public PlaneBuilder setPlaneID(int planeID) {
            this.planeID = planeID;

            return this;
        }

        public PlaneBuilder setPlaneName(String planeName) {
            this.planeName = planeName;

            return this;
        }

        public PlaneBuilder setIsInAir(boolean isInAir) {
            this.isInAir = isInAir;

            return this;
        }

        public PlaneBuilder setPilotName(String pilotName) {
            this.pilotName = pilotName;

            return this;
        }

        public PlaneBuilder setGasCapacity(int gasCapacity) {
            this.gasCapacity = gasCapacity;

            return this;
        }

        public PlaneBuilder build() {

            return this;
        }
    }
}
