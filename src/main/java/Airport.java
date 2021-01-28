import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> planes = new ArrayList<>();
    private int capacity = 2;

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public int getCapacity() {
        return capacity;
    }

    public void land(Plane plane) throws RuntimeException {
        if (this.getPlanes().size() == this.capacity) {
            throw new RuntimeException("Cannot land, airport full!");
        }
        planes.add(plane);
    }

    public void takeoff(Plane plane) {
        planes.remove(plane);
    }
}
