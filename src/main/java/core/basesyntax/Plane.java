package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private int maxSpeed;
    private int yearOfIssue;
    private int capacityPassegers;
    private int capacityFuel;

    public Plane(String model,int maxSpeed,int yearOfIssue,
                 int capacityPassegers, int capacityFuel) {
        this.name = model;
        this.maxSpeed = maxSpeed;
        this.yearOfIssue = yearOfIssue;
        this.capacityPassegers = capacityPassegers;
        this.capacityFuel = capacityFuel;
    }

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.maxSpeed = builder.maxSpeed;
        this.yearOfIssue = builder.yearOfIssue;
        this.capacityPassegers = builder.capacityPassegers;
        this.capacityFuel = builder.capacityFuel;
    }

    public class PlaneBuilder {
        private String name;
        private int maxSpeed;
        private int yearOfIssue;
        private int capacityPassegers;
        private int capacityFuel;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setYearOfIssue(int yearOfIssue) {
            this.yearOfIssue = yearOfIssue;
            return this;
        }

        public PlaneBuilder setCapacityPassegers(int capacityPassegers) {
            this.capacityPassegers = capacityPassegers;
            return this;
        }

        public PlaneBuilder setCapacityFuel(int capacityFuel) {
            this.capacityFuel = capacityFuel;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
