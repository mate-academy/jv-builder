package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String name;
    private int size;
    private String color;
    private int enginePower;
    private boolean passenger;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.size = planeBuilder.size;
        this.color = planeBuilder.color;
        this.enginePower = planeBuilder.enginePower;
        this.passenger = planeBuilder.passenger;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean isPassenger() {
        return passenger;
    }

    public static class PlaneBuilder {

        private String name;
        private int size;
        private String color;
        private int enginePower;
        private boolean passenger;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setEnginePower(int enginePower) {
            this.enginePower = enginePower;
            return this;
        }

        public void setPassenger(boolean passenger) {
            this.passenger = passenger;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
