package core.basesyntax;

public class Plane {
    private int yearOfConstruction;
    private int speed;
    private int numberOfSeats;
    private String model;
    private String color;

    private Plane(PlaneBuilder planeBuilder) {
        this.yearOfConstruction = planeBuilder.yearOfConstruction;
        this.speed = planeBuilder.speed;
        this.numberOfSeats = planeBuilder.numberOfSeats;
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "yearOfConstruction=" + yearOfConstruction
                + ", speed=" + speed + ", numberOfSeats=" + numberOfSeats
                + ", model='" + model + '\''
                + ", color='" + color + '\'' + '}';
    }

    public static class PlaneBuilder {
        private int yearOfConstruction;
        private int speed;
        private int numberOfSeats;
        private String model;
        private String color;

        public PlaneBuilder setYearOfConstruction(int yearOfConstruction) {
            this.yearOfConstruction = yearOfConstruction;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
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

        public Plane build() {
            return new Plane(this);
        }
    }
}
