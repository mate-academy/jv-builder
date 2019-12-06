package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String model;
    private int maxSpeed;
    private double maxHeight;
    private int maxSeats;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.model = builder.model;
        this.maxSpeed = builder.maxSpeed;
        this.maxHeight = builder.maxHeight;
        this.maxSeats = builder.maxSeats;
    }

    public Plane(String name, String model, int maxSpeed, double maxHeight, int maxSeats) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxHeight = maxHeight;
        this.maxSeats = maxSeats;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public class PlaneBuilder {
        private String name;
        private String model;
        private int maxSpeed;
        private double maxHeight;
        private int maxSeats;

        //Getters
        public double getMaxHeight() {
            return maxHeight;
        }

        public int getMaxSeats() {
            return maxSeats;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public String getModel() {
            return model;
        }

        public String getName() {
            return name;
        }

        // Setters
        public void setMaxHeight(double maxHeight) {
            this.maxHeight = maxHeight;
        }

        public void setMaxSeats(int maxSeats) {
            this.maxSeats = maxSeats;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
