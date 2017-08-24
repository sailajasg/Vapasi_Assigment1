package com.thoughtworks.assignments;

import java.util.HashMap;


/** Abstract class to define items list and  methods to select the items purchased with quantity and print receipt
 * Author Sailaja Gade
 * Date 23/08/2017
 * */

abstract public class FoodBazarInventory {
    HashMap<String,Double> itemsList = new HashMap<String,Double>();

    {
        itemsList.put("Apple", 100.0);
        itemsList.put("Orange", 80.0);
        itemsList.put("Banana", 30.0);
        itemsList.put("Kiwi", 120.0);
    }

    abstract void enterItemsPurchased();
    abstract void printReceipt();

}
