package core.basesyntax;

public class Plane {

    private int maxSpeed;
    private int yearOfProduction;
    private int id;
    private String model;
    private String company;

    private Plane(PlaneBuilder planeBuilder) {
        this.maxSpeed = planeBuilder.maxSpeed;
        this.yearOfProduction = planeBuilder.yearOfProduction;
        this.id = planeBuilder.id;
        this.model = planeBuilder.model;
        this.company = planeBuilder.company;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return new StringBuilder("Plane{")
                .append("model = ").append(this.model)
                .append(", company = ").append(this.company)
                .append(", max speed = ").append(this.maxSpeed)
                .append(", production year = ").append(this.yearOfProduction)
                .append(", id = ").append(this.id).toString();
    }

    public static class PlaneBuilder {
        private int maxSpeed;
        private int yearOfProduction;
        private int id;
        private String model;
        private String company;

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setYearOfProduction(int yearOfProduction) {
            this.yearOfProduction = yearOfProduction;
            return this;
        }

        public PlaneBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
