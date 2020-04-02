package core.basesyntax;

public class Plane {

    private int id;
    private int seats;
    private String name;
    private String model;
    private String color;

    private Plane(PlaneBuilder builder) {
        this.id = builder.id;
        this.seats = builder.seats;
        this.name = builder.name;
        this.model = builder.model;
        this.color = builder.color;
    }

    public int getId() {
        return id;
    }

    public int getSeats() {
        return seats;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public static class PlaneBuilder {

        private int id;
        private int seats;
        private String name;
        private String model;
        private String color;

        public PlaneBuilder setName(String name) {
            this.name = name;
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

        public PlaneBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}
