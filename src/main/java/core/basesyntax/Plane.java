package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {

    private String model;
    private String type;
    private int volume;
    private int dateOf;
    private char series;

    private Plane(PlaneBuilder builder) {
        this.model = builder.model;
        this.type = builder.type;
        this.volume = builder.volume;
        this.dateOf = builder.dateOf;
        this.series = builder.series;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public int getVolume() {
        return volume;
    }

    public int getDateOf() {
        return dateOf;
    }

    public char getSeries() {
        return series;
    }

    public static class PlaneBuilder {

        private String model;
        private String type;
        private int volume;
        private int dateOf;
        private char series;

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        public PlaneBuilder setDateOf(int dateOf) {
            this.dateOf = dateOf;
            return this;
        }

        public PlaneBuilder setSeries(char series) {
            this.series = series;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
