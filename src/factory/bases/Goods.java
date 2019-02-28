package factory.bases;

import java.util.ArrayList;

public interface Goods {

    Integer stuffNumber(ArrayList<Property> list);

    double sumPrice(ArrayList<Property> list);
}
