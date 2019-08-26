package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String type;
    private String engine;
    private double weight;
    private String appointment;
    private int yearOfRelease;

    public Plane(String type, String engine, double weight, String appointment, int yearOfRelease) {
        this.type = type;
        this.engine = engine;
        this.weight = weight;
        this.appointment = appointment;
        this.yearOfRelease = yearOfRelease;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.type = planeBuilder.type;
        this.engine = planeBuilder.engine;
        this.weight = planeBuilder.weight;
        this.appointment = planeBuilder.appointment;
        this.yearOfRelease = planeBuilder.yearOfRelease;
    }

    public String getType() {
        return type;
    }

    public String getEngine() {
        return engine;
    }

    public double getWeight() {
        return weight;
    }

    public String getAppointment() {
        return appointment;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public static class PlaneBuilder {
        private String type;
        private String engine;
        private String appointment;
        private double weight;
        private int yearOfRelease;

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public PlaneBuilder setAppointment(String appointment) {
            this.appointment = appointment;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
