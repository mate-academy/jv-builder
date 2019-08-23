package core.basesyntax;


/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {

    private int maxSpeed;
    private long issue;
    private String brand;
    private String model;
    private EngineType engineType;

    public Plane(final int maxSpeed, final long issue, final String brand,
                 final String model, final EngineType engineType) {
        this.maxSpeed = maxSpeed;
        this.issue = issue;
        this.brand = brand;
        this.model = model;
        this.engineType = engineType;
    }

    private Plane(PlaneBuilder builder) {
        this.maxSpeed = builder.maxSpeed;
        this.issue = builder.issue;
        this.brand = builder.brand;
        this.model = builder.model;
        this.engineType = builder.engineType;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public long getIssue() {
        return this.issue;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public EngineType getEngineType() {
        return this.engineType;
    }

    public static class PlaneBuilder {

        private int maxSpeed;
        private long issue;
        private String brand;
        private String model;
        private EngineType engineType;

        public void setMaxSpeed(final int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void setEngineType(final EngineType engineType) {
            this.engineType = engineType;
        }

        public void setModel(final String model) {
            this.model = model;
        }

        public void setBrand(final String brand) {
            this.brand = brand;
        }

        public void setIssue(final long issue) {
            this.issue = issue;
        }

        public Plane build() {
            return new Plane(this);
        }

    }

    static enum EngineType { HeatEngine, ElectricEngine, AirEngine }
}
