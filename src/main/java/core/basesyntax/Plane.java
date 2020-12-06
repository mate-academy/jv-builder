package core.basesyntax;

public class Plane {
    private String model;
    private String color;
    private String size;
    private int doors;
    private int sits;
    private boolean isCargo;

    private Plane(Builder builder) {
        this.model = builder.model;
        this.color = builder.color;
        this.size = builder.size;
        this.doors = builder.doors;
        this.sits = builder.sits;
        this.isCargo = builder.isCargo;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", doors=" + doors +
                ", sits=" + sits +
                ", isCargo=" + isCargo +
                '}';
    }

    public static class Builder {
        private String model;
        private String color;
        private String size;
        private int doors;
        private int sits;
        private boolean isCargo;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder setSits(int sits) {
            this.sits = sits;
            return this;
        }

        public Builder setCargo(boolean cargo) {
            isCargo = cargo;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
