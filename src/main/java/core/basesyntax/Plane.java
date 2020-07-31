package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private int power;
    private int height;
    private boolean isNew;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.power = builder.power;
        this.height = builder.height;
        this.isNew = builder.isNew;
    }

    public class PlaneBuilder {
        private String model;
        private String color;
        private int power;
        private int height;
        private boolean isNew;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PlaneBuilder setisNew(boolean isNew) {
            this.isNew = isNew;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
