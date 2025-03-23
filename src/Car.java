public class Car {
    //    private int engineSize;
//    private int maxSpeed;
    private String color;
    private int fuel;
    private String name;
    private Engine engine;
    private WheelType maxSpeed;

    // motorinhoud ophalen
    public int getEngineSizeFromEngine() {
        return engine.getEngineSize();
    }

    //topsnelheid van wheeltype

    public double maxSpeedFromWheel() {
        return maxSpeed.getTopSpeed();
    }

    //informatie display and fuel
    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", fuel='" + fuel + '\'' +
                ", name='" + name + '\'' +
                ", engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    //brandstof bijvullen
    public int getMoreFuel(int amount)
    {
       return fuel += amount;
    }

}
