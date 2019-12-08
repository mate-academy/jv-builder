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

    public Plane(String type, String model, int maxSpeed, int passengerCapacity,
                 boolean isEconomic) {
        this.type = type;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.isEconomic = isEconomic;
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

        private PlaneBuilder(){
        }

        private String type;
        private String model;
        private int maxSpeed;
        private int passengerCapacity;
        private boolean isEconomic;

        public void setType(String type) {
            this.type = type;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }

        public void setPassengerCapacity(int passengerCapacity) {
            this.passengerCapacity = passengerCapacity;
        }

        public void setIsEconomic(boolean economic) {
            isEconomic = economic;
        }

        public Plane build() {
            return Plane.this;
        }
    }

}
