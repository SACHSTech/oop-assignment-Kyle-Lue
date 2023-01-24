package ShoppingSite;

public class Pants extends Clothes{
    String strType;
    public Pants (double cost, String colour, String size,String type){
        super(cost,colour,size);
        strType = type;
    }
    public String getType(){
        return strType;
    }
    public String toString(){
        System.out.println("--------------------------------------");
        System.out.println("Item: Pants");
        System.out.println("Type: " + getType());
        System.out.println("Cost: " + getCost());
        System.out.println("Colour: " + getColour());
        System.out.println("Size: " + getSize());
        return "--------------------------------------";
      }
}
