public class DisabledSpace extends Space implements IRestrictedSpace {

    public DisabledSpace(int number, Type type) {
        super(number, type);
    }

    @Override
    public String alarm() {
        return "ALARM BELL! Please move your car, you have no disabled sticker";
    }
}
