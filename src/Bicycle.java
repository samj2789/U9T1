public class Bicycle extends Vehicle
{
    private int gearCount;
    private String seat;
    private double seatHeight;

    public Bicycle(String name, int wheels, int gearCount, String seat, double seatHeight)
    {
        super(name, wheels);
        this.gearCount = gearCount;
        this.seat = seat;
        this.seatHeight = seatHeight;
    }

    public void ringBell()
    {
        System.out.println("Ding ding ding - Coming through!");
    }

    public void adjustSeatHeight(double newHeight)
    {
        seatHeight = newHeight;
        System.out.println("Seat height adjusted to: " + newHeight);
    }

    public int getGearCount()
    {
        return gearCount;
    }

    public String getSeat()
    {
        return seat;
    }

    public double getSeatHeight()
    {
        return seatHeight;
    }
}
