package org.example;

public class Main {

    public static void main(String[] args) {

        Image image = new ProxyImage("sample.jpg");

        image.display();
        image.display();

    }
}