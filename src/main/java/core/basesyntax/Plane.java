package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private int enginesQuantity;
    private int crewMembers;
    private int rangeOfFlight;
    private double weight;
    private String identifier;

    public Plane(
            int enginesQuantity,
            int crewMembers,
            int rangeOfFlight,
            double weight,
            String identifier) {
        this.enginesQuantity = enginesQuantity;
        this.crewMembers = crewMembers;
        this.rangeOfFlight = rangeOfFlight;
        this.weight = weight;
        this.identifier = identifier;
    }

    private Plane(PlaneBuilder buildAPlane) {
        this.enginesQuantity = buildAPlane.enginesQuantity;
        this.crewMembers = buildAPlane.crewMembers;
        this.rangeOfFlight = buildAPlane.rangeOfFlight;
        this.weight = buildAPlane.weight;
        this.identifier = buildAPlane.identifier;
    }

    public static class PlaneBuilder {

        private int enginesQuantity;
        private int crewMembers;
        private int rangeOfFlight;
        private double weight;
        private String identifier;

        public PlaneBuilder setEnginesQuantity(int enginesQuantity) {
            this.enginesQuantity = enginesQuantity;
            return this;
        }

        public PlaneBuilder setRangeOfFlight(int crewMembers) {
            this.crewMembers = crewMembers;
            return this;
        }

        public PlaneBuilder setCrewMembers(int rangeOfFlight) {
            this.rangeOfFlight = rangeOfFlight;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setIdentifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
