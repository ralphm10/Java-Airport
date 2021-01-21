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
        assertEquals("747", airportUnderTest.getPlanes().get(0));
    }

    @Test
    public void itCanLandMultiplePlanes() {
        airportUnderTest.land("747");
        airportUnderTest.land("A380");
        assertEquals("A380", airportUnderTest.getPlanes().get(airportUnderTest.getPlanes().size()-1));
    }
}