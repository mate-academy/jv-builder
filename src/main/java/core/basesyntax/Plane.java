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
        this.planeName = builder.setPlaneName;
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

    public class PlaneBuilder {
        public String setPlaneName;

        private PlaneBuilder() {

        }

        public PlaneBuilder setPlaneID(int planeID) {
            Plane.this.planeID = planeID;

            return this;
        }

        public PlaneBuilder setPlaneName(String planeName) {
            Plane.this.planeName = planeName;

            return this;
        }

        public PlaneBuilder setIsInAir(boolean isInAir) {
            Plane.this.isInAir = isInAir;

            return this;
        }

        public PlaneBuilder setPilotName(String pilotName) {
            Plane.this.pilotName = pilotName;

            return this;
        }

        public PlaneBuilder setGasCapacity(int gasCapacity) {
            Plane.this.gasCapacity = gasCapacity;

            return this;
        }

        public Plane build() {

            return Plane.this;
        }
    }
}
