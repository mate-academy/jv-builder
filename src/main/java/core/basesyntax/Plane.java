package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private int weight;
    private int tailNumber;
    private int idNumber;
    private int wheels;

    private Plane(PlaneBuilder planeBuilder) {
        this.name = planeBuilder.name;
        this.weight = planeBuilder.weight;
        this.tailNumber = planeBuilder.tailNumber;
        this.idNumber = planeBuilder.idNumber;
        this.wheels = planeBuilder.wheels;
    }

    @Override
    public String toString() {
        return "Plane{" + "name= "
                + getName() + ", weight= "
                + getWeight() + ", teilNumber= "
                + getTailNumber() + ", idNumber= "
                + getIdNumber() + ", wheels= "
                + getWheels() + ";";
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getTailNumber() {
        return tailNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getWheels() {
        return wheels;
    }

    public static class PlaneBuilder {
        private String name;
        private int weight;
        private int tailNumber;
        private int idNumber;
        private int wheels;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public PlaneBuilder setTailNumber(int tailNumber) {
            this.tailNumber = tailNumber;
            return this;
        }

        public PlaneBuilder setIdNumber(int idNumber) {
            this.idNumber = idNumber;
            return this;
        }

        public PlaneBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
