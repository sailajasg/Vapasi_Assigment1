package com.thoughtworks.assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/** program to implement the methods to print the receipt of the items purchased in Food Bazaar
 * Author Sailaja Gade
 * Date 23/08/2017
 * */

public class PraveenasPurchases extends FoodBazarInventory {

    /*Hashmap to store the list of items purchased aong with qauntity*/
    HashMap<String,Double> itemsBought = new HashMap<String,Double>();

    //Method to Select the items from the list and enter the quantity purchased
    @Override
    void enterItemsPurchased() {

        Scanner sc = new Scanner(System.in);
        String fruitName="";
        Double qty;

        int x=1;
        while (x != 0) {
            System.out.println("Select the fruit \n 1 --> Apple\n 2 --> Banana \n 3 --> Orange \n 0 --> Exit");

            x = sc.nextInt();
            switch (x) {

                case 1:
                    fruitName="Apple";

                    break;
                case 2:
                    fruitName="Banana";
                    break;
                case 3:
                    fruitName="Orange";
                    break;
                case 4:
                    fruitName="Kiwi";
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid selection");
            }
            if(x>0 && x<5) {
                System.out.println("Enter quantity");
                qty = sc.nextDouble();
                {
                    itemsBought.put(fruitName, qty);

                }
            }
        }
    }

    @Override
    void printReceipt() {
        String itemPurchased,itemList;
        Double amount;

        System.out.println("Food Bazaar Receipt");
        System.out.println("-----------------------------");
        Double cost=0.0;
        System.out.println("Fruit\tQuantity\t Amount");
        System.out.println("-----------------------------");
        for(Map.Entry m1:itemsBought.entrySet()){

            for(Map.Entry m2:itemsList.entrySet()){
                itemPurchased=(String)m1.getKey();
                itemList=(String)m2.getKey();
                if(itemPurchased.equalsIgnoreCase(itemList)){
                    amount=(Double)m1.getValue()*(Double) m2.getValue();
                    System.out.println(itemList+"\t"+m1.getValue()+"\t\t\t"+amount);
                  cost=cost+ amount;
                }
            }
        }
        System.out.println("-----------------------------");
        System.out.println("Total Amount::"+cost);
    }


}
