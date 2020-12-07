package core.basesyntax;

public class Plane {
    private String nameCompany;
    private String model;
    private int power;
    private boolean isFirstClass;
    private String countryConnect;

    private Plane(PlaneBuilder builder) {
        this.nameCompany = builder.nameCompany;
        this.model = builder.model;
        this.power = builder.power;
        this.isFirstClass = builder.isFirstClass;
        this.countryConnect = builder.countryConnect;
    }

    public static class PlaneBuilder {
        private String nameCompany;
        private String model;
        private int power;
        private boolean isFirstClass;
        private String countryConnect;

        public PlaneBuilder setNameCompany(String nameCompany) {
            this.nameCompany = nameCompany;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setPower(int power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setIsFirstClass(boolean isFirstClass) {
            this.isFirstClass = isFirstClass;
            return this;
        }

        public PlaneBuilder setCountryConnect(String countryConnect) {
            this.countryConnect = countryConnect;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "Company name: " + nameCompany + "\nModel: " + model
                + "\nPower: " + power + "\nIs the First class: " + isFirstClass
                + "\nCountry connect: " + countryConnect;
    }
}
