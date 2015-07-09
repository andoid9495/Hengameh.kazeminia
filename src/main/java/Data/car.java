package Data;

/**
 * Created by dell on 7/7/2015.
 */
public class car {
    public  String carName;
    public  int imageresource;
    public String instructions;

    public car(String id,int imageresource,String instructions)
    {
        this.carName=id;
        this.imageresource=imageresource;
        this.instructions=instructions;

    }

    @Override
    public String toString()
    {
        return carName;
    }


}
