public class StandardSpace extends Space {

    public StandardSpace(int number, Type type) {
        super(number, type);
    }

    public String standardFine() {
        return fine("2 hours for standard customers");
    }
}
