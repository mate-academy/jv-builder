package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String name;
    private String color;
    private int capacity;
    private String pilot;
    private String company;

    private Plane(PlaneBuilder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.capacity = builder.capacity;
        this.pilot = builder.pilot;
        this.company = builder.company;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getPilot() {
        return pilot;
    }

    public String getCompany() {
        return company;
    }

    public class PlaneBuilder {
        private String name;
        private String color;
        private int capacity;
        private String pilot;
        private String company;

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setPilot(String pilot) {
            this.pilot = pilot;
            return this;
        }

        public PlaneBuilder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
