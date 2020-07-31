package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String type;
    private int id;
    private String colour;
    private int year;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.id = builder.id;
        this.colour = builder.colour;
        this.year = builder.year;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getColour() {
        return colour;
    }

    public int getYear() {
        return year;
    }

    public static PlaneBuilder builder() {
        return new PlaneBuilder();
    }

    public static class PlaneBuilder {
        private String name;
        private String type;
        private int id;
        private String colour;
        private int year;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setColour(String colour) {
            this.colour = colour;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
