package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public final class Plane {
    private String planeModel;
    private int numberOfSeats;
    private int maxHeight;
    private int maxWeight;
    private int speed;

    private Plane(PlaneBuilder builder) {
        this.planeModel = builder.planeModel;
        this.maxHeight = builder.maxHeight;
        this.maxWeight = builder.maxWeight;
        this.numberOfSeats = builder.numberOfSeats;
        this.speed = builder.speed;
    }

    public static class PlaneBuilder {
        private String planeModel;
        private int numberOfSeats;
        private int maxHeight;
        private int maxWeight;
        private int speed;

        public PlaneBuilder setPlaneModel(String planeModel) {
            this.planeModel = planeModel;
            return this;
        }

        public PlaneBuilder setNumberOfSeats(int numberOfSeats) {
            this.numberOfSeats = numberOfSeats;
            return this;
        }

        public PlaneBuilder setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }

        public PlaneBuilder setMaxWeight(int maxWeight) {
            this.maxWeight = maxWeight;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }
    }

    @Override
    public String toString() {
        return "[" + this.planeModel + ", " + this.numberOfSeats
                + " seats, " + this.maxWeight + " kg, "
                + this.maxHeight + " metres, " + this.speed + " km per hour]";
    }

    public static void main(String[] args) {
        Plane.PlaneBuilder planeBuilder = new Plane.PlaneBuilder();
        Plane plane = planeBuilder.setPlaneModel("Boeing-747").setNumberOfSeats(298)
                .setMaxWeight(16000).setMaxHeight(10668).setSpeed(332).build();
        System.out.println(plane);

    }
}


