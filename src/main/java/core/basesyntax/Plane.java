package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String color;
    private String brand;
    private String airLines;
    private int speed;
    private int yearOfIssue;

    public class PlaneBuilder {
        private String color;
        private String brand;
        private String airLines;
        private int speed;
        private int yearOfIssue;

        public PlaneBuilder setColor(String color) {
            Plane.this.color = color;
            return this;
        }

        public PlaneBuilder setBrand(String brand) {
            Plane.this.brand = brand;
            return this;
        }

        public PlaneBuilder setAirLines(String airLines) {
            Plane.this.airLines = airLines;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            Plane.this.speed = speed;
            return this;
        }

        public PlaneBuilder setYearOfIssue(int yearOfIssue) {
            Plane.this.yearOfIssue = yearOfIssue;
            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }

    private Plane(PlaneBuilder builder) {
        this.color = color;
        this.brand = brand;
        this.airLines = airLines;
        this.speed = speed;
        this.yearOfIssue = yearOfIssue;
    }
}
