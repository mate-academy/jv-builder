package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String type;
    private String country;
    private int passengerSeats;
    private int speed;

    public Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.type = planeBuilder.type;
        this.country = planeBuilder.country;
        this.passengerSeats = planeBuilder.passengerSeats;
        this.speed = planeBuilder.speed;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public int getPassengerSeats() {
        return passengerSeats;
    }

    public int getSpeed() {
        return speed;
    }

    public static class PlaneBuilder {
        private String name;
        private String type;
        private String country;
        private int passengerSeats;
        private int speed;

        public PlaneBuilder setName(String name) {
            this.name = name;

            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;

            return this;
        }

        public PlaneBuilder setCountry(String country) {
            this.country = country;

            return this;
        }

        public PlaneBuilder setPassengerSeats(int passengerSeats) {
            this.passengerSeats = passengerSeats;

            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;

            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
