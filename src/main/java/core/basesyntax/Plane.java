package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String model;
    private String color;
    private String typeOfEngine;
    private int numOfEngine;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.color = builder.color;
        this.typeOfEngine = builder.typeOfEngine;
        this.numOfEngine = builder.numOfEngine;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public int getNumOfEngine() {
        return numOfEngine;
    }

    public static class PlaneBuilder {

        private String name;
        private String model;
        private String color;
        private String typeOfEngine;
        private int numOfEngine;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setTypeOfEngine(String typeOfEngine) {
            this.typeOfEngine = typeOfEngine;
            return this;
        }

        public PlaneBuilder setNumOfEngine(int numOfEngine) {
            this.numOfEngine = numOfEngine;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
