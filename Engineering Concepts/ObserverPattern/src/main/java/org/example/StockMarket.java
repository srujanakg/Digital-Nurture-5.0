package org.example;

import java.util.ArrayList;

public class StockMarket {

    private ArrayList<Observer> observers = new ArrayList<>();

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String stock, double price) {
        for (Observer observer : observers) {
            observer.update(stock, price);
        }
    }
}