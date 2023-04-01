public class SportsCar implements Car {
    private int speed;

    @Override
    public void start() {
        System.out.println("Starting sports car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping sports car");
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void accelerate() {
        speed += 10;
        System.out.println("Sports car accelerating to " + speed + " mph");
    }

    @Override
    public void brake() {
        speed -= 10;
        System.out.println("Sports car braking to " + speed + " mph");
    }
}
