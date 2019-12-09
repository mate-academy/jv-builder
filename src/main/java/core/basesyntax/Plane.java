package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String model;
    private String registrationNumber;
    private int length;
    private int height;
    private int weight;

    public Plane(String name, String model, String registrationNumber,
                 int length, int height, int weight) {
        this.name = name;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public class PlaneBuilder {
        private String name;
        private String model;
        private String registrationNumber;
        private int length;
        private int height;
        private int weight;

        private PlaneBuilder(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setRegistrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Plane build() {
            return new Plane(name, model, registrationNumber,
                    length, height, weight);
        }
    }
}
