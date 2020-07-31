package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int wingspan;
    private String fuselageType;
    private String empennageForm;
    private String landingGearType;
    private String aircraftEngineClass;

    private Plane(PlaneBuilder builder) {
        wingspan = builder.wingspan;
        fuselageType = builder.fuselageType;
        empennageForm = builder.empennageForm;
        landingGearType = builder.landingGearType;
        aircraftEngineClass = builder.aircraftEngineClass;
    }

    public int getWingspan() {
        return wingspan;
    }

    public String getFuselageType() {
        return fuselageType;
    }

    public String getEmpennageForm() {
        return empennageForm;
    }

    public String getLandingGearType() {
        return landingGearType;
    }

    public String getAircraftEngineClass() {
        return aircraftEngineClass;
    }

    public static class PlaneBuilder {
        private int wingspan;
        private String fuselageType;
        private String empennageForm;
        private String landingGearType;
        private String aircraftEngineClass;

        public PlaneBuilder setWingspan(int wingspan) {
            this.wingspan = wingspan;
            return this;
        }

        public PlaneBuilder setFuselageType(String fuselageType) {
            this.fuselageType = fuselageType;
            return this;
        }

        public PlaneBuilder setEmpennageForm(String empennageForm) {
            this.empennageForm = empennageForm;
            return this;
        }

        public PlaneBuilder setLandingGearType(String landingGearType) {
            this.landingGearType = landingGearType;
            return this;
        }

        public PlaneBuilder setAircraftEngineClass(String aircraftEngineClass) {
            this.aircraftEngineClass = aircraftEngineClass;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
