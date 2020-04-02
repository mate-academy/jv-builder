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

        private PlaneBuilder() {

        }

        public PlaneBuilder setsize(int size) {
            Plane.this.size = size;

            return this;
        }

        public PlaneBuilder setmodel(String model) {
            Plane.this.model = model;

            return this;
        }

        public PlaneBuilder setnumber(String number) {
            Plane.this.number = number;

            return this;
        }

        public PlaneBuilder setage(int age) {
            Plane.this.age = age;

            return this;
        }

        public PlaneBuilder setprice(long price) {
            Plane.this.price = price;

            return this;
        }

        public Plane build() {
            return Plane.this;
        }
    }
}
