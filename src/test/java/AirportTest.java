import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airportUnderTest;

    @Before
    public void setUp() {
        airportUnderTest = new Airport();
    }

    @Test
    public void itCanLandAPlane() {
        airportUnderTest.land("747");
        assertEquals(airportUnderTest.getPlanes().get(0), "747");
    }
}