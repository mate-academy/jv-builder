package core.basesyntax;

public class Plane {
    private String type;
    private String model;
    private String color;
    private int year;
    private int amountWindows;

    private Plane(PlaneBuilder builder) {
        this.type = builder.type;
        this.model = builder.model;
        this.color = builder.color;
        this.year = builder.year;
        this.amountWindows = builder.amountWindows;
    }

    public static class PlaneBuilder {
        private String type;
        private String model;
        private String color;
        private int year;
        private int amountWindows;

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setAmountWindows(int amountWindows) {
            this.amountWindows = amountWindows;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
