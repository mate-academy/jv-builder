package core.basesyntax;

import java.util.Set;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private String color;
    private int maxSpeed;
    private int numOfSeats;
    private int price;

    public Plane(String name, String color, int maxSpeed, int numOfSeats, int price) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.numOfSeats = numOfSeats;
        this.price = price;
    }

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
        this.numOfSeats = builder.numOfSeats;
        this.price = builder.price;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public int getPrice() {
        return price;
    }

    public static class PlaneBuilder {
        private String name;
        private String color;
        private int maxSpeed;
        private int numOfSeats;
        private int price;
        private Set<Plane> planes;

        public PlaneBuilder(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setNumOfSeats(int numOfSeats) {
            this.numOfSeats = numOfSeats;
            return this;
        }

        public PlaneBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
