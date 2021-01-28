import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AirportTest {

    private Airport airportUnderTest;
    private ArrayList<Plane> landedPlanes;

    @Mock
    Plane plane1 = Mockito.mock(Plane.class);

    @Mock
    Plane plane2 = Mockito.mock(Plane.class);

    @Mock
    Plane plane3 = Mockito.mock(Plane.class);

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

    @Test
    public void itHasACapacity() {
        assertEquals(2,airportUnderTest.getCapacity());
    }

    @Test
    public void shouldThrowExceptionIfAirportIsAtCapacity() {
        airportUnderTest.land(plane1);
        airportUnderTest.land(plane2);
        RuntimeException thrown = assertThrows(
                RuntimeException.class,
                () ->
                        airportUnderTest.land(plane3));

        assertTrue(thrown.getMessage().contains("Cannot land, airport full!"));

    }
}