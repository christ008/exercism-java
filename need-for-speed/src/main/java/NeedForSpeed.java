class NeedForSpeed {
    int battery = 100;
    int distance = 0;
    int speed = 0;
    int batteryDrain = 0;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryDrain > this.battery;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if (!batteryDrained()) {
            battery -= batteryDrain;
            distance += speed;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    int distance = 0;

    RaceTrack(int distance) {
        this.distance = distance;    
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained()) {
            car.drive();
        }
        
        return (car.batteryDrained() && car.distanceDriven() >= distance);
    }
}
