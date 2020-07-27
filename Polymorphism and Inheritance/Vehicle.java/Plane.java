public class Plane extends Vehicle {

    String manufact;
    int model_num;

    Plane(String color,int doors,String manufactoror,int model_n)
    {
        super(doors,color);
        this.manufact=manufactoror;
        this.model_num=model_n;
    }

    @Override
    public String toString() {
        return super.toString()+" "+manufact+" "+model_num;
    }
}
