package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private final String type;
    private final String producer;
    private final String model;
    private final int seatsNumber;
    private final int productionYear;

    private Plane(PlaneBuilder builder) {
        type = builder.planeType;
        producer = builder.planeProducer;
        model = builder.planeModel;
        seatsNumber = builder.seatsNumberInPlane;
        productionYear = builder.planeProductionYear;
    }

    public static class PlaneBuilder {
        private String planeType;
        private String planeProducer;
        private String planeModel;
        private int seatsNumberInPlane;
        private int planeProductionYear;

        public PlaneBuilder setType(String type) {
            planeType = type;
            return this;
        }

        public PlaneBuilder setProducer(String producer) {
            planeProducer = producer;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            planeModel = model;
            return this;
        }

        public PlaneBuilder setSeatsNumber(int seatsNumber) {
            seatsNumberInPlane = seatsNumber;
            return this;
        }

        public PlaneBuilder setProductionYear(int productionYear) {
            planeProductionYear = productionYear;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    public String getType() {
        return type;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public int getProductionYear() {
        return productionYear;
    }
}
