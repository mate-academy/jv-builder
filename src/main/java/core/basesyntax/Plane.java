package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String model;
    private String color;
    private int maxSpeed;
    private int weight;
    private String type;

    public Plane(String model, String color, int maxSpeed,
                 int weight, String type) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.type = type;
    }

    public static class PlaneBuilder {
        private String model;
        private String color;
        private int maxSpeed;
        private int weight;
        private String type;

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    private Plane(PlaneBuilder builder) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.type = type;
    }
}
