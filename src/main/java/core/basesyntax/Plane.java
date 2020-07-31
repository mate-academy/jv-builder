package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private final int id;
    private final String model;
    private final String colour;
    private final int numberOfPassenger;
    private final boolean isSeaplane;

    private Plane(PlaneBuilder planeBuilder) {
        this.id = planeBuilder.id;
        this.model = planeBuilder.model;
        this.colour = planeBuilder.colour;
        this.numberOfPassenger = planeBuilder.numberOfPassenger;
        this.isSeaplane = planeBuilder.isSeaplane;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    public boolean isSeaplane() {
        return isSeaplane;
    }

    @Override
    public String toString() {
        return "Plane{"
               + "id=" + id
               + ", model='" + model + '\''
               + ", colour='" + colour + '\''
               + ", numberOfPassenger=" + numberOfPassenger
               + ", isSeaplane=" + isSeaplane
               + '}';
    }

    public static class PlaneBuilder {
        private int id;
        private String model;
        private String colour;
        private int numberOfPassenger;
        private boolean isSeaplane;

        public PlaneBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setNumberOfPassenger(int numberOfPassenger) {
            this.numberOfPassenger = numberOfPassenger;
            return this;
        }

        public PlaneBuilder setIsSeaplane(boolean seaplane) {
            this.isSeaplane = seaplane;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
