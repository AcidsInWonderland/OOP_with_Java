public class Car extends Vehicle
{
    int doors;
    // System.out.println (new Car ("Black", 4, 4));
    public Car(String color,int passenger,int doors)
    {
        super(passenger,color);
        this.doors=doors;
    }

    @Override
    public String toString() {
        return super.toString()+" "+doors+" doors";
    }
}
