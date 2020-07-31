package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int id;
    private String name;
    private int crewCount;
    private String producer;
    private double height;
    private double length;
    private double wingspan;
    private double weight;

    public Plane(PlaneBuilder planeBuilder) {
        this.id = planeBuilder.id;
        this.name = planeBuilder.name;
        this.crewCount = planeBuilder.crewCount;
        this.producer = planeBuilder.producer;
        this.height = planeBuilder.height;
        this.length = planeBuilder.length;
        this.wingspan = planeBuilder.wingspan;
        this.weight = planeBuilder.weight;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", crewCount=" + crewCount
                + ", producer='" + producer + '\''
                + ", height=" + height
                + ", length=" + length
                + ", wingspan=" + wingspan
                + ", weight=" + weight
                + '}';
    }

    public static class PlaneBuilder {
        private int id;
        private String name;
        private int crewCount;
        private String producer;
        private double height;
        private double length;
        private double wingspan;
        private double weight;

        public PlaneBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public PlaneBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public PlaneBuilder setCrewCount(int crewCount) {
            this.crewCount = crewCount;
            return this;
        }

        public PlaneBuilder setProducer(String producer) {
            this.producer = producer;
            return this;
        }

        public PlaneBuilder setHeight(double height) {
            this.height = height;
            return this;
        }

        public PlaneBuilder setLength(double length) {
            this.length = length;
            return this;
        }

        public PlaneBuilder setWingspan(double wingspan) {
            this.wingspan = wingspan;
            return this;
        }

        public PlaneBuilder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
