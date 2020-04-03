package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private Integer power;
    private Integer size;
    private String color;
    private Integer seats;
    private String model;

    private Plane(PlaneBuilder builderForPlane) {
        this.power = builderForPlane.power;
        this.model = builderForPlane.model;
        this.size = builderForPlane.size;
        this.color = builderForPlane.color;
        this.seats = builderForPlane.seats;
    }

    public Integer getPower() {
        return power;
    }

    public Integer getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Integer getSeats() {
        return seats;
    }

    public String getModel() {
        return model;
    }

    public static class PlaneBuilder {
        private Integer power;
        private Integer size;
        private String color;
        private Integer seats;
        private String model;

        public PlaneBuilder(String model, String color) {
            this.model = model;
            this.color = color;
        }

        public PlaneBuilder setPower(Integer power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setSize(Integer size) {
            this.size = size;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setSeats(Integer seats) {
            this.seats = seats;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}
