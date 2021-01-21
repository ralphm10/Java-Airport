import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class AirportTest {

    private Airport airportUnderTest;
    private Plane planeUnderTest;
    private ArrayList<Plane> landedPlanes;

    @Before
    public void setUp() {
        airportUnderTest = new Airport();
        planeUnderTest = new Plane();
        landedPlanes = airportUnderTest.getPlanes();
    }

    @Test
    public void itCanInstructAPlaneToLand() {
        airportUnderTest.land(planeUnderTest);
        assertThat(landedPlanes).contains(planeUnderTest);
    }

    @Test
    public void itCanInstructMultiplePlanesToLand() {
        airportUnderTest.land(planeUnderTest);
        Plane anotherPlane = new Plane();
        airportUnderTest.land(anotherPlane);
        assertThat(landedPlanes).contains(anotherPlane);
    }

    @Test
    public void itCanInstructAPlaneToTakeOff() {
        airportUnderTest.land(planeUnderTest);
        airportUnderTest.takeoff(planeUnderTest);
        assertThat(landedPlanes).doesNotContain(planeUnderTest);
    }
}