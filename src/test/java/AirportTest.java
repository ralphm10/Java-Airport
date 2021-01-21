import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
    public void itCanLandAPlane() {
        airportUnderTest.land(planeUnderTest);
        assertThat(landedPlanes.contains(planeUnderTest));
    }

    @Test
    public void itCanLandMultiplePlanes() {
        airportUnderTest.land(planeUnderTest);
        Plane anotherPlane = new Plane();
        airportUnderTest.land(anotherPlane);
        assertThat(landedPlanes.contains(anotherPlane));
    }
}