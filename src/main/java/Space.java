public abstract class Space {

    private int number;
    private Car car;

    public Space(int number) {
        this.number = number;
        Car car = null;                 // Initialize to a 'null' Car, to indicate the space is empty.
    }

    public int getNumber() {
        return number;
    }

    public Car getCar() {
        return car;
    };
}
