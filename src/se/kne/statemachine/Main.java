package se.kne.statemachine;

public class Main {

    public static void main(String[] args) {

        Kaffekopp kaffekopp = new Kaffekopp();

        kaffekopp.happening();
        kaffekopp.drinkCoffee();
        kaffekopp.happening();
        kaffekopp.fillCoffee();
        kaffekopp.happening();
        kaffekopp.drinkCoffee();
        kaffekopp.happening();
        kaffekopp.fillCoffee();
        kaffekopp.fillCoffee();
        kaffekopp.happening();

    }
}
