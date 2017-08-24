package com.thoughtworks.assignments;


/*program to print the receipt for the items purchased in food bazaar
 * Author Sailaja Gade
 * Date 23/08/2017
 * */

public class foodBazarApplication {

    public static void main(String[] args) {

        FoodBazarCounter counter= new FoodBazarCounter();
        counter.enterItemsPurchased();
        counter.printReceipt();

    }
}
