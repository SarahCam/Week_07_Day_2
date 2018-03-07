import java.util.ArrayList;

public class CarPark {

    private ArrayList<Space> spaces;
    private String name;

    public CarPark(String name, ArrayList<Space> spaces) {
        this.name = name;
        this.spaces = spaces;
    }
}
