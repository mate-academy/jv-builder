package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String designedGroup;
    private int crew;
    private double emptyWeight;
    private double maxTakeoffWeight;
    private long fuelCapacity;

    public Plane(PlaneBuilder planeBuilder) {
        this.designedGroup = designedGroup;
        this.crew = crew;
        this.emptyWeight = emptyWeight;
        this.maxTakeoffWeight = maxTakeoffWeight;
        this.fuelCapacity = fuelCapacity;
    }

    public String getDesignedGroup() {
        return designedGroup;
    }

    public int getCrew() {
        return crew;
    }

    public double getEmptyWeight() {
        return emptyWeight;
    }

    public double getMaxTakeoffWeight() {
        return maxTakeoffWeight;
    }

    public long getFuelCapacity() {
        return fuelCapacity;
    }

    public static class PlaneBuilder {
        private String designedGroup;
        private int crew;
        private double emptyWeight;
        private double maxTakeoffWeight;
        private long fuelCapacity;

        public PlaneBuilder(){
        }

        public void setDesignedGroup(String designedGroup) {
            this.designedGroup = designedGroup;
        }

        public void setCrew(int crew) {
            this.crew = crew;
        }

        public void setEmptyWeight(double emptyWeight) {
            this.emptyWeight = emptyWeight;
        }

        public void setMaxTakeoffWeight(double maxTakeoffWeight) {
            this.maxTakeoffWeight = maxTakeoffWeight;
        }

        public void setFuelCapacity(long fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
