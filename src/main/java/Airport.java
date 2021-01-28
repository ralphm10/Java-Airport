import java.util.ArrayList;

public class Airport {

    private ArrayList<Plane> planes = new ArrayList<>();
    private int capacity;
    private static final int DEFAULT_CAPACITY = 2;


    public Airport(int capacity) {
        this.capacity = capacity;
    }

    public Airport() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayList<Plane> getPlanes() {
        return planes;
    }

    public int getCapacity() {
        return capacity;
    }

    public void land(Plane plane) throws RuntimeException {
        if (this.getPlanes().size() == this.getCapacity()) {
            throw new RuntimeException("Cannot land, airport full!");
        }
        planes.add(plane);
    }

    public void takeoff(Plane plane) {
        planes.remove(plane);
    }
}
