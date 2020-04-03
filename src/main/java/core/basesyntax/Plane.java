package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изменения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private String brand;
    private String model;
    private int seatsNum;
    private int enginesNum;
    private boolean isSuperSonic;

    private Plane(PlaneBuilder planeBuilder) {
        this.brand = planeBuilder.brand;
        this.model = planeBuilder.model;
        this.seatsNum = planeBuilder.seatsNum;
        this.enginesNum = planeBuilder.enginesNum;
        this.isSuperSonic = planeBuilder.isSuperSonic;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public int getEnginesNum() {
        return enginesNum;
    }

    public boolean isSuperSonic() {
        return isSuperSonic;
    }

    public static class PlaneBuilder {

        private String brand;
        private String model;
        private int seatsNum;
        private int enginesNum;
        private boolean isSuperSonic;

        public PlaneBuilder(String brand) {
            this.brand = brand;
        }

        public PlaneBuilder(String brand, String model, int seatsNum,
                            int enginesNum, boolean isSuperSonic) {
            this.brand = brand;
            this.model = model;
            this.seatsNum = seatsNum;
            this.enginesNum = enginesNum;
            this.isSuperSonic = isSuperSonic;
        }

        public PlaneBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setSeatsNum(int seatsNum) {
            this.seatsNum = seatsNum;
            return this;
        }

        public PlaneBuilder setEnginesNum(int enginesNum) {
            this.enginesNum = enginesNum;
            return this;
        }

        public PlaneBuilder setIsSuperSonic(boolean isSuperSonic) {
            this.isSuperSonic = isSuperSonic;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }
}
