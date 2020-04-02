package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String mark;
    private String name;
    private int seats;
    private double length;
    private boolean flies;

    private Plane(PlaneBuilder builder) {
        this.mark = builder.mark;
        this.name = builder.name;
        this.seats = builder.seats;
        this.length = builder.length;
        this.flies = builder.flies;
    }

    public String getMark() {
        return mark;
    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public double getLength() {
        return length;
    }

    public boolean isFlies() {
        return flies;
    }

    public static class PlaneBuilder {
        private String mark;
        private String name;
        private int seats;
        private double length;
        private boolean flies;

        public PlaneBuilder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public PlaneBuilder setLength(double length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setFlies(boolean flies) {
            this.flies = flies;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
