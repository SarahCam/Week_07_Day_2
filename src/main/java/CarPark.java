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

    public String fine(Space space, int inspectionTime) {
        if ((space.getType() == Type.FAMILY) && (inspectionTime - space.getParkTime() > 300)){      // Remove hardcoding
            return space.fine("3 hours for families");                                              // Need to look at this more
        }
        else if ((space.getType() == Type.DISABLED) && (inspectionTime - space.getParkTime() > 400)){
            return space.fine("4 hours for disabled people");
        }
        else if (inspectionTime - space.getParkTime() > 200){
            return space.fine("2 hours for standard customers");
        }
        else return "NO FINE";
    }
}
