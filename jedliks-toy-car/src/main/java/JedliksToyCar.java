public class JedliksToyCar {
    int battery = 100;
    int distanceDriven = 0;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + battery + "%";
        }
    }
    
    public void drive() {
        if (battery > 0) {
            distanceDriven += 20;
            battery -= 1;
        }
    }
}
