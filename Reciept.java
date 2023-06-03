/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mess.management.system;

/**
 *
 * @author DELL
 */
public class Reciept {
    static final double PIZZA_PRICE = 16.1075;
    static final double CHIPS_PRICE = 1.5215;
    static final double COKE_PRICE = 2.99;
    static final double FRIES_PRICE = 16.1075;
    static final double PASTA_PRICE = 1.5215;
    static final double SHAWARMA_PRICE = 2.99;
    static final double BURGER_PRICE = 16.1075;
    static final double TOFFEES_PRICE = 1.5215;
    static final double BIRYANI_PRICE = 2.99;
    static final double CAKE_PRICE = 2.99;
    String a;
    static int numberPizza;
    static int numberChips;
    static int numberCoke;
    static int numberFries;
    static int numberPasta;
    static int numberShawarma;
    static int numberBurger;
    static int numberToffees;
    static int numberBiryani;
    static int numberCake;
    
    
    static double pizzaTotal = PIZZA_PRICE * numberPizza;
    static double chipsTotal = CHIPS_PRICE * numberChips;
    static double cokeTotal = (COKE_PRICE + 1.20) * numberCoke;
    static double friesTotal = FRIES_PRICE * numberFries;
    static double pastaTotal = PASTA_PRICE * numberPasta;
    static double shawarmaTotal = SHAWARMA_PRICE * numberShawarma;
    static double burgerTotal = BURGER_PRICE * numberBurger;
    static double toffeesTotal = TOFFEES_PRICE * numberToffees;
    static double biryaniTotal = BIRYANI_PRICE * numberBiryani;
    static double cakeTotal = CAKE_PRICE * numberCake;
    static double finalTotal = pizzaTotal + chipsTotal + cokeTotal;
    

}
