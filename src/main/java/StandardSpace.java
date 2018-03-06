public class StandardSpace extends Space {
    
    private Type type;

    public StandardSpace(int number) {
        super(number);
        type = Type.STANDARD;
    }

    public Type getType() {
        return type;
    }
}
