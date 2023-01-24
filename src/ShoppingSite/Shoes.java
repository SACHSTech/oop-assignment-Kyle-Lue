package ShoppingSite;

public class Shoes extends Clothes{
        public Shoes(double cost, String colour, String size)  {
            super(cost, colour, size);
        }
        public String toString(){
            System.out.println("--------------------------------------");
            System.out.println("Item: Shoes");
            System.out.println("Cost: " + getCost());
            System.out.println("Colour: " + getColour());
            System.out.println("Size: " + getSize());
            return "--------------------------------------";
          }
    }