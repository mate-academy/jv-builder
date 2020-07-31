package core.basesyntax;

public class Plane {
    private String geography;
    private String color;
    private int area;
    private int height;
    private boolean isInhabited;

    private Plane(PlaneBuilder builder) {
        this.geography = builder.geography;
        this.color = builder.color;
        this.area = builder.area;
        this.height = builder.height;
        this.isInhabited = builder.isInhabited;
    }

    public class PlaneBuilder {
        private String geography;
        private String color;
        private int area;
        private int height;
        private boolean isInhabited;

        public PlaneBuilder setGeography(String geography) {
            this.geography = geography;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setArea(int area) {
            this.area = area;
            return this;
        }

        public PlaneBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public PlaneBuilder setisInhabited(boolean isInhabited) {
            this.isInhabited = isInhabited;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
