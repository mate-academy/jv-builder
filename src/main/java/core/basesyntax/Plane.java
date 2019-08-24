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

    private Plane() {
    }

    public Plane(int seats, int maxSpeed, int weight, int length, String modelName) {
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.length = length;
        this.modelName = modelName;
    }

    public int getSeats() {
        return seats;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public String getModelName() {
        return modelName;
    }

    public static PlaneBuilder newBuilder() {
        return new Plane().new PlaneBuilder();
    }

    public class PlaneBuilder {

        private PlaneBuilder() {
        }

        public PlaneBuilder setSeats(int seats) {
            Plane.this.seats = seats;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            Plane.this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            Plane.this.weight = weight;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            Plane.this.length = length;
            return this;
        }

        public PlaneBuilder setModelName(String modelName) {
            Plane.this.modelName = modelName;
            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
