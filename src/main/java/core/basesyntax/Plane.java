package core.basesyntax;

/**
 * <p>Создайте свою собственную реализацию паттерна Builder для класса Plane.</p>
 * <p>Добавьте не менее пяти полей в класс Plane.</p>
 */
public class Plane {

    private final String modelName;
    private final int emptyWeight;
    private final int takeoffWeight;
    private final int cruisingSpeed;
    private final int enginePower;
    private final int wingspan;

    public Plane(String modelName, int emptyWeight, int takeoffWeight,
                    int cruisingSpeed, int enginePower, int wingspan) {

        this.modelName = modelName;
        this.emptyWeight = emptyWeight;
        this.takeoffWeight = takeoffWeight;
        this.cruisingSpeed = cruisingSpeed;
        this.enginePower = enginePower;
        this.wingspan = wingspan;
    }

    public String getModelName() {
        return modelName;
    }

    public int getEmptyWeight() {
        return emptyWeight;
    }

    public int getTakeoffWeight() {
        return takeoffWeight;
    }

    public int getCruisingSpeed() {
        return cruisingSpeed;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getWingspan() {
        return wingspan;
    }

    public static class Builder {

        private String modelName;
        private int emptyWeight;
        private int takeoffWeight;
        private int cruisingSpeed;
        private int enginePower;
        private int wingspan;

        public Builder setModelName(String modelName) {
            this.modelName = modelName;

            return this;
        }

        public Builder setEmptyWeight(int emptyWeight) {
            this.emptyWeight = emptyWeight;

            return this;
        }

        public Builder setTakeoffWeight(int takeoffWeight) {
            this.takeoffWeight = takeoffWeight;

            return this;
        }

        public Builder setCruisingSpeed(int cruisingSpeed) {
            this.cruisingSpeed = cruisingSpeed;

            return this;
        }

        public Builder setEnginePower(int enginePower) {
            this.enginePower = enginePower;

            return this;
        }

        public Builder setWingspan(int wingspan) {
            this.wingspan = wingspan;

            return this;
        }

        public Plane build() {
            return new Plane(modelName, emptyWeight, takeoffWeight,
                             cruisingSpeed, enginePower, wingspan);
        }
    }
}