package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private int power;
    private double capacityEngine;
    private int numberOfSeats;
    private String type;

    public Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.getName();
        this.power = planeBuilder.getPower();
        this.capacityEngine = planeBuilder.getCapacityEngine();
        this.numberOfSeats = planeBuilder.getNumberOfSeats();
        this.type = planeBuilder.getType();

    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public double getCapacityEngine() {
        return capacityEngine;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getType() {
        return type;
    }

    public static class PlaneBuilder {
        private String name;
        private int power;
        private double capacityEngine;
        private int numberOfSeats;
        private String type;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPower() {
            return power;
        }

        public void setPower(int power) {
            this.power = power;
        }

        public double getCapacityEngine() {
            return capacityEngine;
        }

        public void setCapacityEngine(double capacityEngine) {
            this.capacityEngine = capacityEngine;
        }

        public int getNumberOfSeats() {
            return numberOfSeats;
        }

        public void setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
