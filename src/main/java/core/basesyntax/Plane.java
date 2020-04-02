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
        this.model = builder.model;
        this.color = builder.color;
        this.length = builder.length;
        this.wingsWidth = builder.wingsWidth;
        this.enginesCount = builder.enginesCount;
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
        private String model;
        private String color;
        private int length;
        private int wingsWidth;
        private int enginesCount;

        public PlaneBuilder(String model) {
            this.model = model;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWingsWidth(int wingsWidth) {
            this.wingsWidth = wingsWidth;
            return this;
        }

        public PlaneBuilder setEnginesCount(int enginesCount) {
            this.enginesCount = enginesCount;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
