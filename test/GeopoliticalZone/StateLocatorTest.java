package GeopoliticalZone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StateLocatorTest {

    @Test

    public void shouldReturnSouthWestWhenStateIsLagos() {

        StateLocator locator = new StateLocator();

        assertEquals(

                GeoPoliticalZone.SOUTH_WEST,

                locator.findZone("Lagos")

        );

    }
    @Test
    public void shouldReturnSouthEastWhenStateIsEnugu() {

        StateLocator locator = new StateLocator();

        assertEquals(
                GeoPoliticalZone.SOUTH_EAST,
                locator.findZone("Enugu")
        );

    }
    @Test
    public void shouldReturnNorthWestWhenStateIsKaduna() {

        StateLocator locator = new StateLocator();

        assertEquals(
                GeoPoliticalZone.NORTH_WEST,
                locator.findZone("Kaduna")
        );

    }
    @Test
    public void shouldReturnNullForUnknownState() {

        StateLocator locator = new StateLocator();

        assertThrows(IllegalArgumentException.class, () -> locator.findZone("Ikeja"));

    }
}
