package AirCondition
;

public class AirConditioner {

    private boolean isOn = false;
    private int temperature;
    public boolean turnOn() {
        return true;
    }

    public boolean isOn() {
        return true;
    }

    public boolean turnOff() {
       return isOn = false;

    }

    public void temperatureIncreases() {
         this.temperature = this.temperature + 1;

        if(this.temperature>30) this.temperature = 30;

    }

    public void setTemperature(int temperature)    {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void temperatureDecreases() {
        temperature = temperature - 1;

        if(temperature<16) temperature = 16;
    }
}
