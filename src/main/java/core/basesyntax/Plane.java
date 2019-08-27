package core.basesyntax;

import java.util.HashMap;
import java.util.HashSet;

public final class Plane {

    private int capacity;
    private String airlines;
    private String pilot;
    private HashSet<String> baggages;
    private HashMap<String, Integer> sits;

    private Plane(PlaneBuilder planeBuilder) {
        this.airlines = planeBuilder.airlines;
        this.baggage = planeBuilder.baggage;
        this.pilot = planeBuilder.pilot;
        this.capacity = planeBuilder.capacity;
        this.sits = planeBuilder.sits;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getAirlines() {
        return airlines;
    }

    public String getPilot() {
        return pilot;
    }

    public HashSet<String> getBaggage() {
        return baggage;
    }

    public HashMap<String, Integer> getSits() {
        return sits;
    }

    public Plane(int capacity, String airlines, String pilot,
                 HashMap<String, Integer> sits, HashSet<String> baggage) {
        this.airlines = airlines;
        this.baggage = baggage;
        this.pilot = pilot;
        this.capacity = capacity;
        this.sits = sits;
    }

    public static class PlaneBuilder {

        private int capacity;
        private String airlines;
        private String pilot;
        private HashSet<String> baggage;
        private HashMap<String, Integer> sits;

        public PlaneBuilder(int capacity) {
            this.capacity = capacity;
        }

        public PlaneBuilder setSits(HashMap<String, Integer> sits) {
            this.sits = sits;
            return this;
        }

        public PlaneBuilder setCapacity(int capacity) {
            this.capacity = capacity;
            return this;
        }

        public PlaneBuilder setBaggage(HashSet<String> baggage) {
            this.baggage = baggage;
            return this;
        }

        public PlaneBuilder setAirlines(String airlines) {
            this.airlines = airlines;
            return this;
        }

        public PlaneBuilder setPilot(String pilot) {
            this.pilot = pilot;
            return this;
        }

        public Plane build() {
            return new Plane(this);
        }

    }
}
