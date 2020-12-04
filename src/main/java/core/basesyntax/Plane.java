package core.basesyntax;

public class Plane {
    private String nameOfCompany;
    private String color;
    private int yearIssue;
    private int maxSpeed;
    private int numberOfSeats;

    private Plane(PlaneBuilder builder) {
        this.nameOfCompany = builder.nameOfCompany;
        this.color = builder.color;
        this.yearIssue = builder.yearIssue;
        this.maxSpeed = builder.maxSpeed;
        this.numberOfSeats = builder.numberOfSeats;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "nameOfCompany='" + nameOfCompany + '\''
                + ", color='" + color + '\''
                + ", yearIssue=" + yearIssue
                + ", maxSpeed=" + maxSpeed
                + ", numberOfSeats=" + numberOfSeats
                + '}';
    }

    public static class PlaneBuilder {
        private String nameOfCompany;
        private String color;
        private int yearIssue;
        private int maxSpeed;
        private int numberOfSeats;

        public PlaneBuilder setNameOfCompany(String nameOfCompany) {
            this.nameOfCompany = nameOfCompany;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setYearIssue(int yearIssue) {
            this.yearIssue = yearIssue;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
