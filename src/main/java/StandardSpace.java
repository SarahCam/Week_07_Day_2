public class StandardSpace extends Space {
    
    private SpaceType type;

    public StandardSpace(int number) {
        super(number);
        type = SpaceType.STANDARD;
    }

    public SpaceType getType() {
        return type;
    }
}
