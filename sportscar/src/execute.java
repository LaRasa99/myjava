class mnnn{
    public static void main(String[] args){
        SportsCar myCar = new SportsCar();
        myCar.start();
        myCar.accelerate();
        myCar.accelerate();
        System.out.println("Current speed: " + myCar.getSpeed());
        myCar.brake();
        System.out.println("Current speed: " + myCar.getSpeed());
        myCar.stop();

    }
}