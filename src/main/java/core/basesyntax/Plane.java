package core.basesyntax;

public class Plane {
    private String manufacturer;
    private String model;
    private String type;
    private int firstFlight;
    private int introduction;
    private int maxSpeed;
    private int maxHeight;
    
    private Plane(PlaneBuilder planeBuilder) {
        this.manufacturer = planeBuilder.manufacturer;
        this.model = planeBuilder.model;
        this.type = planeBuilder.type;
        this.firstFlight = planeBuilder.firstFlight;
        this.introduction = planeBuilder.introduction;
        this.maxHeight = planeBuilder.maxHeight;
        this.maxSpeed = planeBuilder.maxSpeed;
    }
    
    @Override
    public String toString() {
        return "Plane{"
                + "manufacturer='" + manufacturer + '\''
                + ", model='" + model + '\''
                + ", type='" + type + '\''
                + ", firstFlight=" + firstFlight
                + ", introduction=" + introduction
                + ", maxSpeed=" + maxSpeed
                + ", maxHeight=" + maxHeight
                + '}';
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public String getModel() {
        return model;
    }
    
    public String getType() {
        return type;
    }
    
    public int getFirstFlight() {
        return firstFlight;
    }
    
    public int getIntroduction() {
        return introduction;
    }
    
    public int getMaxSpeed() {
        return maxSpeed;
    }
    
    public double getMaxHeight() {
        return maxHeight;
    }
    
    public static class PlaneBuilder {
        private String manufacturer;
        private String model;
        private String type;
        private int firstFlight;
        private int introduction;
        private int maxHeight;
        private int maxSpeed;
        
        public PlaneBuilder setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }
        
        public PlaneBuilder setModel(String model) {
            this.model = model;
            return this;
        }
        
        public PlaneBuilder setType(String type) {
            this.type = type;
            return this;
        }
        
        public PlaneBuilder setFirstFlight(int firstFlight) {
            this.firstFlight = firstFlight;
            return this;
        }
        
        public PlaneBuilder setIntroduction(int introduction) {
            this.introduction = introduction;
            return this;
        }
        
        public PlaneBuilder setMaxHeight(int maxHeight) {
            this.maxHeight = maxHeight;
            return this;
        }
        
        public PlaneBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        
        public Plane build() {
            return new Plane(this);
        }
    }
}
