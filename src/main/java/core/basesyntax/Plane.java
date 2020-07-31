package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String model;
    private String typeBySize;
    private String typeByLanding;
    private String typeByPurpose;
    private String companyOwner;

    public Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.typeBySize = builder.typeBySize;
        this.typeByLanding = builder.typeByLanding;
        this.typeByPurpose = builder.typeByPurpose;
        this.companyOwner = builder.companyOwner;
    }

    public String getModel() {
        return this.model;
    }

    public String getTypeBySize() {
        return this.typeBySize;
    }

    public String getTypeByLanding() {
        return this.typeByLanding;
    }

    public String getTypeByPurpose() {
        return this.typeByPurpose;
    }

    public String getCompanyOwner() {
        return this.companyOwner;
    }

    public static class PlaneBuilder {

        public String model;
        public String typeBySize;
        public String typeByLanding;
        public String typeByPurpose;
        public String companyOwner;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setTypeBySize(String typeBySize) {
            this.typeBySize = typeBySize;
            return this;
        }

        public PlaneBuilder setTypeByLanding(String typeByLanding) {
            this.typeByLanding = typeByLanding;
            return this;
        }

        public PlaneBuilder setTypeByPurpose(String typeByPurpose) {
            this.typeByPurpose = typeByPurpose;
            return this;
        }

        public PlaneBuilder setCompanyOwner(String companyOwner) {
            this.companyOwner = companyOwner;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
