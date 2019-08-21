package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane</p>
 */

public class Plane {
    private String a; //TODO: add correct
    private String b;
    private String c;
    private String d;
    private String e;

    public class PlaneBuilder {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;

        public void setA(String a) {
            this.a = a;
        }

        public void setB(String b) {
            this.b = b;
        }

        public void setC(String c) {
            this.c = c;
        }

        public void setD(String d) {
            this.d = d;
        }

        public void setE(String e) {
            this.e = e;
        }


        public Plane build() { return null;}
    }
}
