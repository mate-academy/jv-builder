package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private double yearIssue;
    private int speed;
    private int countOfPassengers;

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public double getYearIssue() {
        return yearIssue;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCountOfPassengers() {
        return countOfPassengers;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearIssue=" + yearIssue +
                ", speed=" + speed +
                ", countOfPassengers=" + countOfPassengers +
                '}';
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.model = planeBuilder.model;
        this.color = planeBuilder.color;
        this.yearIssue = planeBuilder.yearIssue;
        this.speed = planeBuilder.speed;
        this.countOfPassengers = planeBuilder.countOfPassengers;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private double yearIssue;
        private int speed;
        private int countOfPassengers;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setYearIssue(double yearIssue) {
            this.yearIssue = yearIssue;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setCountOfPassengers(int countOfPassengers) {
            this.countOfPassengers = countOfPassengers;
            return this;
        }

        public Plane build() {
            if (speed < 0 || countOfPassengers < 0) {
                throw new RuntimeException("Value is less than 0");
            }
            return new Plane(this);
        }
    }
}
