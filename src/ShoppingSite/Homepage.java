package ShoppingSite;

import java.io.*;
import ShoppingSite.*;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Homepage {
  private int intItems;
  private ArrayList<Shirt> shirts;
  private ArrayList<Pants> pants;
  private ArrayList<Shoes> shoes;

  /**
    * Constructor - creates a new homepage instance
    * @param 
    */
  public Homepage(int items){
    intItems = items;
    String pattern = "#0.00";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);
    // Initializes the developers and managers lists
    shirts = new ArrayList<Shirt>();
    pants = new ArrayList<Pants>();
    shoes = new ArrayList<Shoes>();
  }

  /**
  * Method allows for the adding of a developer
  * @return void
  */
  public void addShirt(Shirt newShirt){
    shirts.add(newShirt);
  }

  /**
  * Method allows for the adding of new pants
  * @return void
  */
  public void addPants(Pants newPants){
    pants.add(newPants);
  }

/**
  * Method allows for the adding of new shoes
  * @return void
  */
  public void addShoes(Shoes newShoes){
    shoes.add(newShoes);
  }

  /**
  * Method allows for getting number of shirts
  * @return number of shirts
  */
  public int getNumShirts(){
    return shirts.size();
  }

  /**
  * Method allows for getting number of pants
  * @return number of pants
  */
  public int getNumPants(){
    return pants.size();
  }

  /**
  * Method allows for getting number of shoes
  * @return number of shoes
  */
  public int getNumShoes(){
    return shoes.size();
  }

  /**
  * Method allows for getting the total developer payroll
  * @return total payroll for developers
  */
  public double getTotalCostShirts(){
    double totalCost = 0;
    for(int i = 0; i < getNumShirts(); i++){
      totalCost = totalCost + shirts.get(i).getCost();
    }
    return totalCost;
  }

  /**
  * Method allows for getting the total manager payroll
  * @return total payroll for managers
  */
  public double getTotalCostPants(){
    double totalCost = 0;
    for(int i = 0; i < getNumPants(); i++){
      totalCost = totalCost + pants.get(i).getCost();
    }
    return totalCost;
  }

    /**
  * Method allows for getting the total manager payroll
  * @return total payroll for managers
  */
  public double getTotalCostShoes(){
    double totalCost = 0;
    for(int i = 0; i < getNumShoes(); i++){
      totalCost = totalCost + shoes.get(i).getCost();
    }
    return totalCost;
  }

  /**
  * Method allows for the printing out of all the managers
  * @return void
  */
  public void printShirts(){
    for (int i = 0; i < getNumShirts(); i++) {
      System.out.println(shirts.get(i));
    }
  }

  /**
  * Method allows for the printing out of all the developers
  * @return void
  */
  public void printPants(){
    for (int i = 0; i < getNumPants(); i++) {
      System.out.println(pants.get(i));
    }
  } 

  /**
  * Method allows for the printing out of all the developers
  * @return void
  */
  public void printShoes(){
    for (int i = 0; i < getNumShoes(); i++) {
      System.out.println(shoes.get(i));
    }
  } 
}
