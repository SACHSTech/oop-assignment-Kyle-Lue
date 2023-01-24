package ShoppingSite;

/**
 *  Super Class
 */
public class Clothes {
    
    private double dblCost;
    private String StrColour;
    private String StrSize;

public Clothes(double cost, String colour,String size){
    dblCost = cost;
    StrColour = colour;
    StrSize = size;
}

public double getCost(){
    return dblCost;
}

public String getColour(){
    return StrColour;
}

public String getSize(){
    return StrSize;
}
}