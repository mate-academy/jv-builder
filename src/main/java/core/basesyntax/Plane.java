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

    private Plane(PlaneBuilder pb) {
        pb.build();
    }

    public class PlaneBuilder {

        private int size1;
        private String model1;
        private String number1;
        private long price1;
        private int age1;

        private PlaneBuilder() {

        }

        public PlaneBuilder setsize(int size) {
            this.size1 = size;

            return this;
        }

        public PlaneBuilder setmodel(String model) {
            this.model1 = model;

            return this;
        }

        public PlaneBuilder setnumber(String number) {
            this.number1 = number;

            return this;
        }

        public PlaneBuilder setage(int age) {
            this.age1 = age;

            return this;
        }

        public PlaneBuilder setprice(long price) {
            this.price1 = price;

            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
