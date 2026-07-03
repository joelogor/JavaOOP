package autoBike;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AutoBikeTest {

    private AutoBike autoBike;

    @BeforeEach
    public void setUp() {
        autoBike = new AutoBike();
        autoBike.isOn();

    }

    @Test
    public void turnOnAutoBike_isOn(){


        autoBike.turnOn();

        assertTrue(autoBike.isOn());
    }@Test
    public void turnOffAutoBike_autoBikeIsOff(){

        autoBike.turnOff();

        assertTrue(autoBike.isOn());
    }

    @Test
    public void gearIncreased_accelerationIncreases(){

        autoBike.isAccelerate();
        autoBike.setAccelerate(15);

        autoBike.increaseGear(1);

        assertEquals(16, autoBike.getAccelerate());

    }

    @Test
    public void gearIncreased2_accelerationIncreases2(){

        while (autoBike.getAccelerate() < 24) {
            autoBike.accelerate();
        }
        assertEquals(25, autoBike.getAccelerate());

        autoBike.increaseGear(2);

        assertEquals(27, autoBike.getAccelerate());

    }

    @Test
    public void gearDecreased_accelerationDecreases() {

        for (int initial_speed = 0; initial_speed < 16; initial_speed++) {
            autoBike.accelerate();
        }
        assertEquals(16, autoBike.getAccelerate());

        autoBike.decreaseGear(1);

        assertEquals(15, autoBike.getAccelerate());


    }
    @Test
    public void gearDecreased2_accelerationDecreases2() {

        for (int initial_speed = 0; initial_speed < 16; initial_speed++) {
            autoBike.accelerate();
        }
        assertEquals(16, autoBike.getAccelerate());

        autoBike.decreaseGear(2);

        assertEquals(14, autoBike.getAccelerate());


    }
    @Test
    public void speedIncreasedTo21_gearIncreasedTo2() {

        for (int initial_speed = 0; initial_speed <= 19; initial_speed++) {
            autoBike.accelerate();
        }

        assertEquals(20, autoBike.getAccelerate());

        autoBike.accelerate();
        autoBike.accelerate();

        assertEquals(23, autoBike.getAccelerate());


    }
    @Test
    public void speedIncreasedTo31_gearIncreasedTo3() {

        while (autoBike.getAccelerate() < 30) {
            autoBike.accelerate();
        }

        assertEquals(31, autoBike.getAccelerate());

        autoBike.accelerate();

        assertEquals(34, autoBike.getAccelerate());

    }

    @Test
    public void speedIncreasedTo41_gearIncreasedTo4() {

        while (autoBike.getAccelerate() < 41) {
            autoBike.accelerate();
        }

        assertEquals(43, autoBike.getAccelerate());

        autoBike.accelerate();

        assertEquals(47, autoBike.getAccelerate());


    }



}

