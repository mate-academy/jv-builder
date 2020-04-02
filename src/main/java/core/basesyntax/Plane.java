package core.basesyntax;

public class Plane {
    private int speed;
    private int length;
    private int width;
    private double weight;
    private String typeOfPlane;

    private Plane(PlaneBuilder planeBuilder) {
        this.speed = planeBuilder.speed;
        this.length = planeBuilder.length;
        this.width = planeBuilder.width;
        this.weight = planeBuilder.weight;
        this.typeOfPlane = planeBuilder.typeOfPlane;
    }

    public int getSpeed() {
        return speed;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public double getWeight() {
        return weight;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public static class PlaneBuilder {

        private int speed;
        private int length;
        private int width;
        private double weight;
        private String typeOfPlane;

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setTypeOfPlane(String typeOfPlane) {
            this.typeOfPlane = typeOfPlane;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
