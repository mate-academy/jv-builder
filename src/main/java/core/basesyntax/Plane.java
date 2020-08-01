package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String model;
    private String type;
    private String colour;
    private String size;
    private int maxSpeed;

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.type = planeBuilder.type;
        this.colour = planeBuilder.colour;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.size = planeBuilder.size;
    }

    @Override
    public String toString() {
        return "information about plane: \n" + "Model of plane: " + model
                + "\ntype of plane: " + type + "\nColour: " + colour
                + "\nmax speed: " + maxSpeed + "\nsize: " + size;
    }

    public static class PlaneBuilder {
        private String model;
        private String type;
        private String colour;
        private String size;
        private int maxSpeed;

        PlaneBuilder() {
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
