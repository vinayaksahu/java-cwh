class CarClass {
    private String color;
    private int maxSpeed;

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void carInfo() {
        System.out.println("Car Color: " + color + ", Max Speed: " + maxSpeed);
    }
}
class Engine {
    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}
class Maserati extends Car {
    public void MaseratiStartDemo() {
        Engine maseratiEngine = new Engine();
        maseratiEngine.start();
        maseratiEngine.stop();
    }
}


public class Car {
    public static void main(String[] args) {
        CarClass nano = new CarClass();
        nano.setColor("Red");
        nano.setMaxSpeed(329);
        nano.carInfo();

        Maserati quattroporte = new Maserati();
        quattroporte.MaseratiStartDemo();
    }
}