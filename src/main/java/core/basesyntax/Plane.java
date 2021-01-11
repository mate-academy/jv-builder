package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private int year;
    private double price;
    private String color;
    private int age;

    public Plane(String name, int year, double price, String color, int age) {
        this.name = name;
        this.year = year;
        this.price = price;
        this.color = color;
        this.age = age;
    }

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.year = builder.year;
        this.price = builder.price;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "name='" + name
                + '\'' + ", year="
                + year + ", price="
                + price + ", color='"
                + color + '\'' + ", age="
                + age + '}';
    }

    public static class PlaneBuilder {
        private String name;
        private int year;
        private double price;
        private String color;
        private int age;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
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
