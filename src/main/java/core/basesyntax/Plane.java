package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String mark;
    private String type;
    private String power;
    private String engineType;
    private int numOfEngine;

    private Plane(PlaneBuilder planeBuilder) {
        this.mark = planeBuilder.mark;
        this.type = planeBuilder.type;
        this.power = planeBuilder.power;
        this.engineType = planeBuilder.engineType;
        this.numOfEngine = planeBuilder.numOfEngine;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "mark='" + mark + '\''
                + ", type='" + type + '\''
                + ", power='" + power + '\''
                + ", engineType='" + engineType + '\''
                + ", numOfEngine=" + numOfEngine
                + '}';
    }

    public String getMark() {
        return mark;
    }

    public String getType() {
        return type;
    }

    public String getPower() {
        return power;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getNumOfEngine() {
        return numOfEngine;
    }

    public static class PlaneBuilder {
        private String mark;
        private String type;
        private String power;
        private String engineType;
        private int numOfEngine;

        public PlaneBuilder() {
        }

        public PlaneBuilder setMark(String mark) {
            this.mark = mark;
            return this;
        }

        public PlaneBuilder setPower(String power) {
            this.power = power;
            return this;
        }

        public PlaneBuilder setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setNumOfEngine(int numOfEngine) {
            this.numOfEngine = numOfEngine;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
