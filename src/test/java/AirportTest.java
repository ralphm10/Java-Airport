import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AirportTest {

    private Airport airportUnderTest;
    private Plane planeUnderTest;

    @Before
    public void setUp() {
        airportUnderTest = new Airport();
        planeUnderTest = new Plane();
    }

    @Test
    public void itCanLandAPlane() {
        airportUnderTest.land(planeUnderTest);
        assertEquals(planeUnderTest, airportUnderTest.getPlanes().get(0));
    }

    @Test
    public void itCanLandMultiplePlanes() {
        airportUnderTest.land(planeUnderTest);
        Plane anotherPlane = new Plane();
        airportUnderTest.land(anotherPlane);
        assertEquals(anotherPlane, airportUnderTest.getPlanes().get(airportUnderTest.getPlanes().size()-1));
    }
}