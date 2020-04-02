package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int length;
    private int wingsWidth;
    private int enginesCount;

    private Plane(PlaneBuilder builder) {
        this.model = builder.newPlane.model;
        this.color = builder.newPlane.color;
        this.length = builder.newPlane.length;
        this.wingsWidth = builder.newPlane.wingsWidth;
        this.enginesCount = builder.newPlane.enginesCount;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public int getWingsWidth() {
        return wingsWidth;
    }

    public int getEnginesCount() {
        return enginesCount;
    }

    public static class PlaneBuilder {
        private Plane newPlane;
        private PlaneBuilder builder;

        public PlaneBuilder() {
            newPlane = new Plane(builder);
        }

        public PlaneBuilder setModel(String model) {
            newPlane.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            newPlane.color = color;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            newPlane.length = length;
            return this;
        }

        public PlaneBuilder setWingsWidth(int wingsWidth) {
            newPlane.wingsWidth = wingsWidth;
            return this;
        }

        public PlaneBuilder setEnginesCount(int enginesCount) {
            newPlane.enginesCount = enginesCount;
            return this;
        }

        public Plane build() {
            return newPlane;
        }
    }
}
