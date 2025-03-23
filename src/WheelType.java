public class WheelType
{
    private String name;
    private double diameter;
    private double profile;

    //top snelheid...
    public double getTopSpeed()
    {
        return (diameter + profile);
    }
}
