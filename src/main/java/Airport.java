import java.util.ArrayList;

public class Airport {

    private ArrayList<String> planes = new ArrayList<String>();

    public ArrayList<String> getPlanes() {
        return planes;
    }

    public void land(String plane) {
        planes.add(plane);
    }

}
