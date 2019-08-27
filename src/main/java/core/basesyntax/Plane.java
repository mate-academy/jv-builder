package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */
public class Plane {

    private int seats;
    private int maxSpeed;
    private int weight;
    private int length;
    private String modelName;

    public Plane(int seats, int maxSpeed, int weight, int length, String modelName) {
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.length = length;
        this.modelName = modelName;
    }

    private Plane(PlaneBuilder builder) {
        seats = builder.seats;
        maxSpeed = builder.maxSpeed;
        weight = builder.weight;
        length = builder.length;
        modelName = builder.modelName;
    }
    
    public static class PlaneBuilder {

        private int seats;
        private int maxSpeed;
        private int weight;
        private int length;
        private String modelName;

        public PlaneBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
