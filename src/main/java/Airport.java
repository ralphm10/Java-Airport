import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> planes = new ArrayList<>();

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public void land(Plane plane) {
        planes.add(plane);
    }

    public void takeoff(Plane plane) {
        planes.remove(plane);
    }
}
