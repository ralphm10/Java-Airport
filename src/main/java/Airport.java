import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> planes = new ArrayList<>();
    private int capacity = 5;

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public int getCapacity() {
        return capacity;
    }

    public void land(Plane plane) {
        planes.add(plane);
    }

    public void takeoff(Plane plane) {
        planes.remove(plane);
    }
}
