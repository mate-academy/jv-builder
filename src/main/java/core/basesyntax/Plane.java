package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String engineType;
    private int length;
    private int width;
    private int height;

    public Plane(String model, String engineType, int length, int width, int height) {
        this.model = model;
        this.engineType = engineType;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.engineType = builder.engineType;
        this.length = builder.length;
        this.width = builder.width;
        this.height = builder.height;
    }

    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static class PlaneBuilder {

        private String model;
        private String engineType;
        private int length;
        private int width;
        private int height;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public PlaneBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
