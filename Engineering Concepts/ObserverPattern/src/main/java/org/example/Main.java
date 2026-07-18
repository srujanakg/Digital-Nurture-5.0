package org.example;

public class Main {

    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        market.register(new MobileApp());
        market.register(new WebApp());

        market.notifyObservers("TCS", 3850.50);

    }
}