package Data;

import java.util.ArrayList;
import java.util.List;

import hk.kazemi.R;

/**
 * Created by dell on 7/7/2015.
 */
public class carData {


    private List<car> cars= new ArrayList<car>();
    public  List<car> getCars()
    {
         return cars;
    }

    public  carData()
    {
        addItem(new car("Benz", R.drawable.benz,"one of the best product of this company,beautiful,luxury car"));
        addItem(new car("206", R.drawable.p206," iran khodro product,small,silver,beautiful"));
        addItem(new car("405", R.drawable.p405,"iran khodro product,gray"));
        addItem(new car("lang rover", R.drawable.langrover,"one of the best product of this company,beautiful,luxury car,big"));
        addItem(new car("baby car", R.drawable.car,"Its for babies to play , pink,beautiful "));


    }
    private  void  addItem(car item)
    {
        cars.add(item);
    }

}
