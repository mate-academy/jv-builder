package core.basesyntax;

import java.util.HashMap;
import java.util.HashSet;

public class Plane {

    private int capacity;
    private String airlines;
    private String pilot;
    private HashSet<String> baggage;
    private HashMap<String, Integer> seats;

    private Plane(PlaneBuilder planeBuilder) {
        this.airlines = planeBuilder.airlines;
        this.baggage = planeBuilder.baggage;
        this.pilot = planeBuilder.pilot;
        this.capacity = planeBuilder.capacity;
        this.seats = planeBuilder.seats;
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

    public HashMap<String, Integer> getSeats() {
        return seats;
    }

    public Plane(int capacity, String airlines, String pilot,
                 HashMap<String, Integer> seats, HashSet<String> baggage) {
        this.airlines = airlines;
        this.baggage = baggage;
        this.pilot = pilot;
        this.capacity = capacity;
        this.seats = seats;
    }

    public static class PlaneBuilder {

        private int capacity;
        private String airlines;
        private String pilot;
        private HashSet<String> baggage;
        private HashMap<String, Integer> seats;


        public PlaneBuilder setSeats(HashMap<String, Integer> seats) {
            this.seats = seats;
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
