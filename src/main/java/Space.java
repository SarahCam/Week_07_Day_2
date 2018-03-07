public abstract class Space {

    private int number;
    private Type type;
    private Car car;
    private int parkTime;

    public Space(int number, Type type) {
        this.number = number;
        this.type = type;
        this.car = null;                     // Initialize to a 'null' Car, to indicate the space is empty.
        this.parkTime = 0000;                // Initialize to 00 Hours 00 Minutes.
    }

    public int getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public Car getCar() {
        return car;
    }

    public int getParkTime() {
        return parkTime;
    }

    // Park an instance of Car 'car' in this space at the specified 'time':
    public void park(Car car, int time) {
        this.car = car;
        this.parkTime = time;
    }

    // Return 'true' if no car is parked in this space:
    public boolean isEmpty() {
        return car == null;
    }

    // Send a fine letter to the car owner:
    public String fine(String fineType) {
        return "FINE LETTER! Exceeded maximum free parking allowance of: " + fineType;
    }
}
