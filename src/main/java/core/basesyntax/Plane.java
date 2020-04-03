package core.basesyntax;

public class Plane {

    private String colour;
    private int weight;
    private String company;
    private int value;
    private int speed;

    public Plane(PlaneBuilder planeBuilder) {
        this.colour = planeBuilder.colour;
        this.weight = planeBuilder.weight;
        this.company = planeBuilder.company;
        this.value = planeBuilder.value;
        this.speed = planeBuilder.speed;
    }

    public String getColour() {
        return colour;
    }

    public int getWeight() {
        return weight;
    }

    public String getCompany() {
        return company;
    }

    public int getValue() {
        return value;
    }

    public int getSpeed() {
        return speed;
    }

    public static class PlaneBuilder {

        private String colour;
        private int weight;
        private String company;
        private int value;
        private int speed;

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public PlaneBuilder setValue(int value) {
            this.value = value;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}


