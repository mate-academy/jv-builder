package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String type;
    private String model;
    private int numberOfSeats;
    private int length;
    private int height;

    public Plane(String type, String model, int numberOfSeats, int length, int height) {
        this.type = type;
        this.model = model;
        this.numberOfSeats = numberOfSeats;
        this.length = length;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public class PlaneBuilder {

        private String type;
        private String model;
        private int numberOfSeats;
        private int length;
        private int height;

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public Plane build() {
            return new Plane(this.type = type,
                    this.model = model,
                    this.numberOfSeats = numberOfSeats,
                    this.length = length,
                    this.height = height);
        }
    }
}






