package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int param1;
    private int param2;
    private int param3;
    private int param4;
    private int param5;

    public Plane(PlaneBuilder planeBuilder) {

    }

    public class PlaneBuilder {

        private int paramParam;

        public PlaneBuilder(int param1) {
            Plane.this.param1 = param1;
        }

        public Plane build() {
            return new Plane(this);
        }

        public PlaneBuilder setParam1(int param1) {
            Plane.this.param1 = param1;
            return this;
        }

        public PlaneBuilder setParam2(int param1) {
            Plane.this.param2 = param2;
            return this;
        }

        public PlaneBuilder setParam3(int param1) {
            Plane.this.param3 = param3;
            return this;
        }

        public PlaneBuilder setParam4(int param1) {
            Plane.this.param4 = param4;
            return this;
        }

        public PlaneBuilder setParam5(int param1) {
            Plane.this.param5 = param5;
            return this;
        }
    }
}
