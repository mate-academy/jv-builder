package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String planeName;
    private String companyName;
    private int maxSpeed;
    private int maxFuel;
    private int seats;

    public Plane(String planeName, String companyName, int maxSpeed, int maxFuel, int seats) {
        this.planeName = planeName;
        this.companyName = companyName;
        this.maxSpeed = maxSpeed;
        this.maxFuel = maxFuel;
        this.seats = seats;
    }

    public String getPlaneName() {
        return planeName;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getSeats() {
        return seats;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public static class PlaneBuilder {
        private String planeName;
        private String companyName;
        private int maxSpeed;
        private int maxFuel;
        private int seats;

        public PlaneBuilder setPlaneName(String planeName) {
            this.planeName = planeName;
            return this;
        }

        public PlaneBuilder setMaxFuel(int maxFuel) {
            this.maxFuel = maxFuel;
            return this;
        }

        public PlaneBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public PlaneBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Plane build() {
            return new Plane(planeName, companyName, maxSpeed, maxFuel, seats);
        }
    }
}
