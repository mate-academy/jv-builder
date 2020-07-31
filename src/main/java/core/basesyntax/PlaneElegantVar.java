package core.basesyntax;

public class PlaneElegantVar {
    private int id;
    private int weight;
    private int speed;
    private String model;
    private String color;
    private PlaneBuilder planeBuilder;

    private PlaneElegantVar() {
    }

    public static PlaneBuilder newPlainBuilder() {
        return new PlaneElegantVar().new PlaneBuilder();
    }

    class PlaneBuilder {
        public PlaneBuilder setId(int id) {
            PlaneElegantVar.this.id = id;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            PlaneElegantVar.this.weight = weight;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            PlaneElegantVar.this.speed = speed;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            PlaneElegantVar.this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            PlaneElegantVar.this.color = color;
            return this;
        }

        public PlaneElegantVar build() {
            return PlaneElegantVar.this;
        }
    }

    @Override
    public String toString() {
        return "Plane{"
                + "id=" + id
                + ", weight=" + weight
                + ", speed=" + speed
                + ", model='" + model + '\''
                + ", color='" + color + '\''
                + '}';
    }
}
