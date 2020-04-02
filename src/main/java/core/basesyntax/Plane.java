package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String nameOfCompany;
    private String size;
    private String type;
    private int timeTravelled;
    private int speed;

    private Plane(PlaneBuilder builder) {
        this.nameOfCompany = builder.nameOfCompany;
        this.size = builder.size;
        this.type = builder.type;
        this.timeTravelled = builder.timeTravelled;
        this.speed = builder.speed;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public int getTimeTravelled() {
        return timeTravelled;
    }

    public int getSpeed() {
        return speed;
    }

    public static class PlaneBuilder {
        private String nameOfCompany;
        private String size;
        private String type;
        private int timeTravelled;
        private int speed;

        public PlaneBuilder setNameOfCompany(String nameOfCompany) {
            this.nameOfCompany = nameOfCompany;
            return this;
        }

        public PlaneBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setTimeTravelled(int timeTravelled) {
            this.timeTravelled = timeTravelled;
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
