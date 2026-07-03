package autoBike;

public class AutoBike {

    private int speed = 0;
    private int gear = 1;


    public boolean isOn() {
        return true;
    }

    public boolean turnOn() {
        return true;
    }

    public boolean turnOff() {
        return false;
    }

    public boolean isAccelerate() {
        return true;
    }

    public void increaseGear(int gear) {
        this.speed = this.speed + gear;
    }

    public void setAccelerate(int speed) {
        this.speed = speed;
    }

    public int getAccelerate() {
        return speed;
    }

    public void decreaseGear(int gear) {
        speed = speed - gear;
    }

    public int accelerate() {
        if (this.speed >= 41) {
            this.speed += 4;
        }
        else if (this.speed >= 31) {
            this.speed += 3;
        }
        else if (this.speed >= 21) {
            this.speed += 2;
        }
        else {
            this.speed += 1;
        }

        return this.speed;
    }

}
