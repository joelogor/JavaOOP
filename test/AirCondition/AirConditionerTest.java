package AirCondition
;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionerTest {

    private AirConditioner airConditioner;

    @BeforeEach
    public void setup() {
        airConditioner = new AirConditioner();
    }

    @Test
    public void turnOnAnAirConditioner_isOn() {

        airConditioner.turnOn();

        assertTrue(airConditioner.isOn());
    }

    @Test
    public void turnAirConditionerOff_isOff(){


        airConditioner.isOn();
        
        
        airConditioner.turnOff();

        assertTrue(airConditioner.isOn());
    }

    @Test
    public void temperatureIncrease16_temperatureIncreases17(){
        airConditioner.isOn();
        airConditioner.setTemperature(16);

        airConditioner.temperatureIncreases();


        assertEquals( 17,  airConditioner.getTemperature());
    }

    @Test
    public void temperatureDecrease17_temperatureDecreases16(){
        airConditioner.isOn();
        airConditioner.setTemperature(17);

        airConditioner.temperatureDecreases();


        assertEquals( 16,  airConditioner.getTemperature());
    }

    @Test
    public void temperatureIncreaseBeyond30_temperatureStill30(){

        airConditioner.isOn();
        airConditioner.setTemperature(30);

        airConditioner.temperatureIncreases();

        assertEquals(30,airConditioner.getTemperature() );




    }
    @Test
    public void temperatureDecreaseBelow16_temperatureStill16(){

        airConditioner.isOn();
        airConditioner.setTemperature(16);

        airConditioner.temperatureDecreases();

        assertEquals(16,airConditioner.getTemperature() );




    }
}



