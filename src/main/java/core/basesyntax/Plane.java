package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String name;
    private String type;
    private Integer id;
    private Integer speed;
    private String color;

    public Plane(String name, String type, Integer id, Integer speed, String color) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.speed = speed;
        this.color = color;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.type = planeBuilder.type;
        this.id = planeBuilder.id;
        this.speed = planeBuilder.speed;
        this.color = planeBuilder.color;
    }

    public static class PlaneBuilder {
        private String name;
        private String type;
        private Integer id;
        private Integer speed;
        private String color;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setSpeed(Integer speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
