package core.basesyntax;

public class BuilderTestApp {

    public static void main(String[] args) {
        Plane boeing = new Plane.PlaneBuilder().setColor("pink").build();
    }
}

