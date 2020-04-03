package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int size;
    private String model;
    private String number;
    private long price;
    private int age;

    private Plane(PlaneBuilder planeBuilder) {
        this.size = planeBuilder.size;
        this.model = planeBuilder.model;
        this.number = planeBuilder.number;
        this.price = planeBuilder.price;
        this.age = planeBuilder.age;
    }

    public static class PlaneBuilder {
        private int size;
        private String model;
        private String number;
        private long price;
        private int age;

        public PlaneBuilder() {

        }

        public PlaneBuilder setsize(int size) {
            this.size = size;

            return this;
        }

        public PlaneBuilder setmodel(String model) {
            this.model = model;

            return this;
        }

        public PlaneBuilder setnumber(String number) {
            this.number = number;

            return this;
        }

        public PlaneBuilder setage(int age) {
            this.age = age;

            return this;
        }

        public PlaneBuilder setprice(long price) {
            this.price = price;

            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
