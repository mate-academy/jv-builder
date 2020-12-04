package core.basesyntax;

public class Plane {
    private String type;
    private String model;
    private int year;
    private int speed;
    private String chassis;
    private String fuselage;

    private Plane(PlaneBuilder builder) {
        this.type = builder.type;
        this.model = builder.model;
        this.year = builder.year;
        this.speed = builder.speed;
        this.chassis = builder.chassis;
        this.fuselage = builder.fuselage;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "type='" + type + '\''
                + ", model='" + model + '\''
                + ", year=" + year
                + ", speed=" + speed
                + ", chassis='" + chassis + '\''
                + ", fuselage='" + fuselage + '\''
                + '}';
    }

    public static class PlaneBuilder {
        private String type;
        private String model;
        private int year;
        private int speed;
        private String chassis;
        private String fuselage;

        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public PlaneBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public PlaneBuilder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public PlaneBuilder setChassis(String chassis) {
            this.chassis = chassis;
            return this;
        }

        public PlaneBuilder setFuselage(String fuselage) {
            this.fuselage = fuselage;
            return this;
        }

        public Plane build() {
            if (year <= 1900 && speed <= 0) {
                throw new RuntimeException("Incorrect plane year!");
            }
            if (speed <= 0) {
                throw new RuntimeException("Incorrect plane speed!");
            }
            return new Plane(this);
        }
    }

}
