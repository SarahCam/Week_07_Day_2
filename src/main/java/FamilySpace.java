public class FamilySpace extends Space implements IRestrictedSpace {

    public FamilySpace(int number, Type type) {
        super(number, type);
    }

    @Override
    public String alarm() {
        return "ALARM BELL! Please move your car, you have no young children";
    }

    // Send a fine letter to the owner of the family car:
    public String familyFine() {
        return fine("3 hours for families");
    }

}
