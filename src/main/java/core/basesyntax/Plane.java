package core.basesyntax;

/*
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public final class Plane {
    private String brand;
    private String name;
    private int capacity;
    private int size;
    private int age;

    private Plane(PlaneBuilder planeBuilder) {
        this.brand = planeBuilder.brand;
        this.name = planeBuilder.name;
        this.capacity = planeBuilder.capacity;
        this.size = planeBuilder.size;
        this.age = planeBuilder.age;

    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "brand='" + brand + '\''
                + ", name='" + name + '\''
                + ", capacity=" + capacity
                + ", size=" + size
                + ", age=" + age + '}';
    }

    public static class PlaneBuilder {
        private String brand;
        private String name;
        private int capacity;
        private int size;
        private int age;

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public PlaneBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}