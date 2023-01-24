package ShoppingSite;

import java.io.*;
import ShoppingSite.*;
import java.text.DecimalFormat;
public class Main{

    public static void main(String[] args) throws IOException{
        // Variables 
        int newItem = 1;
        int intChoice = 0;
        double totalCost = 0;
        double totalCostShirt = 0;
        double totalCostPants = 0;
        double totalCostShoes = 0;
        String strTotalCostShirt;
        String strTotalCostPants;
        String strTotalCostShoes;
        String strTotalCost;
        String pattern = "#0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String addItem;
        Shirt newShirt;
        Pants newPants;
        Shoes newShoes;
        Homepage theHomepage = new Homepage(intChoice);
        // Set up the buffered reader
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--- Welcome to this Shopping Site ---");
        while(newItem >= 1){
            System.out.println("Items:");
            System.out.println("1. Shirt");
            System.out.println("2. Pants");
            System.out.println("3. Shoes");
            // Asks user for their choice 
            System.out.print("What item would you like to purchase: ");
            intChoice = Integer.parseInt(key.readLine());
            if(intChoice == 1){
                System.out.print("Type: ");
                String type = key.readLine();
      
                System.out.print("Cost: ");
                double cost = Double.parseDouble(key.readLine());
                
                System.out.println("Colour: ");
                String colour = key.readLine();

                System.out.print("Size: ");
                String size = key.readLine();
                
                newShirt = new Shirt(cost,colour,size,type);
                theHomepage.addShirt(newShirt);
                System.out.println(newShirt);
            }else if(intChoice == 2){
                System.out.print("Type: ");
                String type = key.readLine();
      
                System.out.print("Cost: ");
                double cost = Double.parseDouble(key.readLine());
                
                System.out.print("Colour: ");
                String colour = key.readLine();

                System.out.print("Size: ");
                String size = key.readLine();
                
                newPants = new Pants(cost,colour,size,type);
                theHomepage.addPants(newPants);
                System.out.println(newPants);
            }else if(intChoice == 3){
                System.out.print("Cost: ");
                double cost = Double.parseDouble(key.readLine());
                
                System.out.print("Colour: ");
                String colour = key.readLine();

                System.out.print("Size: ");
                String size = key.readLine();
                
                newShoes = new Shoes(cost,colour,size);
                theHomepage.addShoes(newShoes);
                System.out.println(newShoes);
            }
            System.out.print("Would you like to get another item? (yes or no): ");
            addItem = key.readLine();
            if(addItem.equalsIgnoreCase("yes")){
                newItem += 1;
            }else if(addItem.equalsIgnoreCase("no")){
                newItem = 0;
            }
        }
            // Formats every cost to two decimal places
            totalCostShirt = theHomepage.getTotalCostShirts();
            strTotalCostShirt = decimalFormat.format(totalCostShirt);
            totalCostPants = theHomepage.getTotalCostPants();
            strTotalCostPants = decimalFormat.format(totalCostPants);
            totalCostShoes = theHomepage.getTotalCostShoes();
            strTotalCostShoes = decimalFormat.format(totalCostShoes);
            // Prints out the total amount and the total cost of all the items
            System.out.println("Checkout");
            System.out.println("Total Amount of Shirts: " + theHomepage.getNumShirts());
            System.out.println("Total Amount of Pants: " + theHomepage.getNumPants());
            System.out.println("Total Number of Shoes: " + theHomepage.getNumShoes());
            System.out.println("Total Cost of the Shirts: $" + strTotalCostShirt);
            System.out.println("Total Cost of the Pants: $" + strTotalCostPants);
            System.out.println("Total Cost of the Shoes: $" + strTotalCostShoes);
            totalCost = theHomepage.getTotalCostShirts() + theHomepage.getTotalCostPants() + theHomepage.getTotalCostShoes();
            strTotalCost = decimalFormat.format(totalCost);
            System.out.println("The total cost of all the items is: $" + strTotalCost);
    }
}