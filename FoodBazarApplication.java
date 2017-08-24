package com.thoughtworks.assignments;


/*program to print the receipt for the items purchased in food bazaar
 * Author Sailaja Gade
 * Date 23/08/2017
 * */

public class FoodBazarApplication {

    public static void main(String[] args) {

        PraveenasPurchases counter= new PraveenasPurchases();
        counter.enterItemsPurchased();
        counter.printReceipt();

    }
}
