public class Train extends Vehicle
{
    private String operator;
    private String powerType;
    private String tractionMotor;
    private String brake;
    private double weight;
    private double maximumSpeed;
    private double powerOutput;
    private int numberBuilt;

    public Train(String name, int wheels, String operator, String powerType, String tractionMotor, String brake, double weight, double maximumSpeed, double powerOutput, int numberBuilt)
    {
        super (name, wheels);
        this.operator = operator;
        this.powerType = powerType;
        this.tractionMotor = tractionMotor;
        this.brake = brake;
        this.weight = weight;
        this.maximumSpeed = maximumSpeed;
        this.powerOutput = powerOutput;
        this.numberBuilt = numberBuilt;
    }

    public void honkHorn()
    {
        System.out.println("HONK HONK HONK STEP AWAY FROM THE TRACKS");
    }

    public String getOperator()
    {
        return operator;
    }

    public String getPowerType()
    {
        return powerType;
    }

    public String getTractionMotor()
    {
        return tractionMotor;
    }

    public String brake()
    {
        return brake;
    }

    public double weight()
    {
        return weight;
    }

    public double maximumSpeed()
    {
        return maximumSpeed;
    }

    public double getPowerOutput()
    {
        return powerOutput;
    }

    public int getNumberBuilt()
    {
        return numberBuilt;
    }
}
