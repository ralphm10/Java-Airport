import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
        assertThat(airportUnderTest.getPlanes().contains(planeUnderTest));
    }

    @Test
    public void itCanLandMultiplePlanes() {
        airportUnderTest.land(planeUnderTest);
        Plane anotherPlane = new Plane();
        airportUnderTest.land(anotherPlane);
        assertThat(airportUnderTest.getPlanes().contains(anotherPlane));
    }
}