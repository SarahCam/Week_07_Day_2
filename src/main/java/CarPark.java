import java.util.ArrayList;

public class CarPark {

    private ArrayList<Space> spaces;
    private String name;

    public CarPark(String name, ArrayList<Space> spaces) {
        this.name = name;
        this.spaces = spaces;
    }

    public Car getCar(Space space) {
        return space.getCar();
    }

    public void park(Car car, Space space, int time) {
        space.park(car, time);
    }

    public int getParkTime(Space space) {
        return space.getParkTime();
    }


    public String alarm(Car car, Space space) {
        if ((car.getType() != Type.DISABLED) && (space.getType() == Type.DISABLED)){
            return "ALARM BELL! Please move your car, you have no disabled sticker";    // Need to look at this more
        }
        else if ((car.getType() != Type.FAMILY) && (space.getType() == Type.FAMILY)){
            return "ALARM BELL! Please move your car, you have no young children";      // Need to look at this more
        }
        else return "NO ALARM BELL";
    }
}
