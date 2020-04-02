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

    public Plane(PlaneBuilder builderForPlane) {
        this.model = builderForPlane.model;
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

    public class PlaneBuilder {
        private Integer power;
        private Integer size;
        private String color;
        private Integer seats;
        private String model;

        private PlaneBuilder() {
        }

        public PlaneBuilder setPower(Integer power) {
            Plane.this.power = power;
            return this;
        }

        public PlaneBuilder setSize(Integer size) {
            Plane.this.size = size;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            Plane.this.color = color;
            return this;
        }

        public PlaneBuilder setSeats(Integer seats) {
            Plane.this.seats = seats;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            Plane.this.model = model;
            return this;
        }

        public Plane build() {
            return Plane.this;
        }

    }
}
