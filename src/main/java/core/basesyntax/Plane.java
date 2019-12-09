package core.basesyntax;


/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */
public class Plane {
    private String type;
    private String model;
    private int maxSpeed;
    private int passengerCapacity;
    private boolean isEconomic;

    public Plane(String type, String model,
                 int maxSpeed, int passengerCapacity, boolean isEconomic) {
        this.type = type;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.isEconomic = isEconomic;
    }

    private Plane(PlaneBuilder planeBuilder) {
        this.type = planeBuilder.type;
        this.model = planeBuilder.model;
        this.maxSpeed = planeBuilder.maxSpeed;
        this.passengerCapacity = planeBuilder.passengerCapacity;
        this.isEconomic = planeBuilder.isEconomic;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public boolean isEconomic() {
        return isEconomic;
    }

    public class PlaneBuilder {
        private String type;
        private String model;
        private int maxSpeed;
        private int passengerCapacity;
        private boolean isEconomic;

        private PlaneBuilder() {

        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public PlaneBuilder setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
            return this;
        }

        public PlaneBuilder setIsEconomic(boolean isEconomic) {
            this.isEconomic = isEconomic;
            return this;
        }

        public Plane build() {
            Plane plane = new Plane(this);
            return Plane.this;
        }
    }
}
