package core.basesyntax;

public interface Builder {
    Builder setWingspan(int wingspan);

    Builder setFuselageType(String fuselageType);

    Builder setEmpennageForm(String empennageForm);

    Builder setLandingGearType(String landingGearType);

    Builder setAircraftEngineClass(String aircraftEngineClass);

    Plane build();
}
