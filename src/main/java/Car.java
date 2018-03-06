public class Car {

    private String registration;
    private Type type;

    public Car(String registration, Type type) {
        this.registration = registration;
        this.type = type;
    }

    public String getRegistration() {
        return registration;
    }

    public Type getType() {
        return type;
    }
}
