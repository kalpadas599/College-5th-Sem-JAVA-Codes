class Car {
    // Private variables (Encapsulation)
    private String model;
    private int speed;

    // Constructor
    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    // Public method to access the private variable speed
    public int getSpeed() {
        return speed;
    }

    // Public method to modify the private variable speed
    public void setSpeed(int speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    // Optional: Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
