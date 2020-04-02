package core.basesyntax;

public class Plane {

    private String brand;
    private int model;
    private int power;
    private String color;
    private int wheelsDiameter;

    public Plane(PlaneBuilder planeBuilder) {
        this.brand = planeBuilder.brand;
        this.model = planeBuilder.model;
        this.power = planeBuilder.power;
        this.color = planeBuilder.color;
        this.wheelsDiameter = planeBuilder.wheelsDiameter;
    }

    public static class PlaneBuilder {
        //Required
        private String brand;
        private int model;
        //Optional
        private int power = 0;
        private String color = null;
        private int wheelsDiameter = 0;

        public PlaneBuilder(String brand, int model) {
            this.brand = brand;
            this.model = model;
        }

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(int model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setWheelsDiameter(int wheelsDiameter) {
            this.wheelsDiameter = wheelsDiameter;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}


