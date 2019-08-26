package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

import java.util.Set;

public class Plane {
    private String type;
    private double mass;
    private double maxSpeed;
    private int crewQuantity;
    private boolean military;
    private Set<Plane> planeSquadron;

    public Plane(String type, double mass, double maxSpeed, int crewQuantity,
                  boolean military, Set<Plane> planeSquadron) {
        this.type = type;
        this.mass = mass;
        this.maxSpeed = maxSpeed;
        this.crewQuantity = crewQuantity;
        this.military = military;
        this.planeSquadron = planeSquadron;
    }

    public String getType() {
        return type;
    }

    public double getMass() {
        return mass;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getCrewQuantity() {
        return crewQuantity;
    }

    public boolean getMilitary() {
        return military;
    }

    public Set<Plane> getPlaneSquadron() {
        return planeSquadron;
    }

    public static class PlaneBuilder {
        private String type;
        private double mass;
        private double maxSpeed;
        private int crewQuantity;
        private boolean military;
        private Set<Plane> planeSquadron;

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setMass(double mass) {
            this.mass = mass;
            return this;
        }

        public PlaneBuilder setMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setCrewQuantity(int crewQuantity) {
            this.crewQuantity = crewQuantity;
            return this;
        }

        public PlaneBuilder setMilitary(boolean military) {
            this.military = military;
            return this;
        }

        public PlaneBuilder setPlaneSquadron(Set<Plane> planeSquadron) {
            this.planeSquadron = planeSquadron;
            return this;
        }

        public Plane build() {
            return new Plane(type, mass, maxSpeed, crewQuantity, military, planeSquadron);
        }

        public static void main(String[] args) {
            Plane bestPlane = new Plane.PlaneBuilder()
                    .setType("Interceptor")
                    .setMass(19000)
                    .setMaxSpeed(11000)
                    .setCrewQuantity(1)
                    .setMilitary(true)
                    .build();
        }
    }
}
