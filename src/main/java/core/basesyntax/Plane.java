package core.basesyntax;

/**
 * <p>Дано класс Plane. Написать класс PlaneBuilder, который реализует паттерн Builder.
 * Добавьте не менее пяти полей в класс Plain. Внести все необходимые изминения в класс Plane
 * которые могут потребоваться для реализации паттерна Builder.</p>
 */

public class Plane {
    private int modelNumber;
    private int passangerCapacity;
    private int width;
    private double realeseYear;
    private String color;

    public Plane(int modelNumber, int passangerCapacity,
                 int width, double realeseYear, String color) {
        this.modelNumber = modelNumber;
        this.passangerCapacity = passangerCapacity;
        this.width = width;
        this.realeseYear = realeseYear;
        this.color = color;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public int getWidth() {
        return width;
    }

    public double getRealeseYear() {
        return realeseYear;
    }

    public String getColor() {
        return color;
    }

    public static class PlaneBuilder {
        private int modelNumber;
        private int passangerCapacity;
        private int width;
        private double realeseYear;
        private String color;

        public PlaneBuilder setModelNumber(int modelNumber) {
            this.modelNumber = modelNumber;
            return this;
        }

        public PlaneBuilder setPassangerCapacity(int passangerCapacity) {
            this.passangerCapacity = passangerCapacity;
            return this;
        }

        public PlaneBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public PlaneBuilder setRealeseYear(double realeseYear) {
            this.realeseYear = realeseYear;
            return this;
        }

        public PlaneBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Plane build() {
            return new Plane(modelNumber, passangerCapacity, width, realeseYear, color);
        }
    }
}
