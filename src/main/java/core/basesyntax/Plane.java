package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String vendor;
    private String vendorCountry;
    private String serialNumber;
    private long mileage;

    public Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.vendor = builder.vendor;
        this.vendorCountry = builder.vendorCountry;
        this.serialNumber = builder.serialNumber;
        this.mileage = builder.mileage;
    }

    public static class PlaneBuilder {
        private String model;
        private String vendor;
        private String vendorCountry;
        private String serialNumber;
        private long mileage;

        public PlaneBuilder(String model) {
            this.model = model;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public PlaneBuilder setVendorCountry(String vendorCountry) {
            this.vendorCountry = vendorCountry;
            return this;
        }

        public PlaneBuilder setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public PlaneBuilder setMileage(long mileage) {
            this.mileage = mileage;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
