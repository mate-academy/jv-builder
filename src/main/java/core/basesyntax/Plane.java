package core.basesyntax;

import java.util.Date;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */

public class Plane {
    private String planeName;
    private String departurePoint;
    private int planeCapacity;
    private int soldTicket;
    private Date releaseDate;

    public Plane(String planeName,
                 String departurePoint,
                 int planeCapacity,
                 int soldTicket,
                 Date releaseDate) {
        this.planeName = planeName;
        this.departurePoint = departurePoint;
        this.planeCapacity = planeCapacity;
        this.soldTicket = soldTicket;
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Plane{"
                + "planeName='" + planeName + '\''
                + ", departurePoint='"
                + departurePoint + '\''
                + ", planeCapacity=" + planeCapacity
                + ", soldTicket=" + soldTicket
                + ", releaseDate=" + releaseDate + '}';
    }

    public static class PlaneBuilder {
        private String planeName;
        private String departurePoint;
        private int planeCapacity;
        private int soldTicket;
        private Date releaseDate;


        public PlaneBuilder setPlaneName(String name) {
            this.planeName = name;
            return this;
        }

        public PlaneBuilder setDeparturePoint(String departurePoint) {
            this.departurePoint = departurePoint;
            return this;
        }

        public PlaneBuilder setPlaneCapacity(int capacity) {
            this.planeCapacity = capacity;
            return this;
        }

        public PlaneBuilder setSoldTicket(int soltedTickets) {
            this.soldTicket = soltedTickets;
            return this;
        }

        public PlaneBuilder setReleaseDate(Date year) {
            this.releaseDate = year;
            return this;
        }

        public Plane build() {
            return new Plane(planeName, departurePoint, planeCapacity, soldTicket, releaseDate);
        }
    }
}