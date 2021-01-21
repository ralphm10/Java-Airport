import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.*;

public class AirportTest {

    private Airport airportUnderTest;
    private ArrayList<Plane> landedPlanes;

    @Mock
    Plane plane1;

    @Mock
    Plane plane2;

    @Before
    public void setUp() {
        airportUnderTest = new Airport();
        landedPlanes = airportUnderTest.getPlanes();
    }

    @Test
    public void itCanInstructAPlaneToLand() {
        airportUnderTest.land(plane1);
        assertThat(landedPlanes).contains(plane1);
    }

    @Test
    public void itCanInstructMultiplePlanesToLand() {
        airportUnderTest.land(plane1);
        airportUnderTest.land(plane2);
        assertThat(landedPlanes).contains(plane2);
    }

    @Test
    public void itCanInstructAPlaneToTakeOff() {
        airportUnderTest.land(plane1);
        airportUnderTest.takeoff(plane1);
        assertThat(landedPlanes).doesNotContain(plane1);
    }
}