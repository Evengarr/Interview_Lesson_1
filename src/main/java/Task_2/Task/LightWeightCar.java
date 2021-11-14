package Task_2.Task;

public class LightWeightCar extends Car{
    @Override
    public void move() {
        System.out.println("Car is move");
    }

    @Override
    public void start() {
        System.out.println("Car starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");
    }

    @Override
    void open() {
        System.out.println("Car is open");
    }
}
