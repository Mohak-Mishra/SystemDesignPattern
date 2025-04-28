package com.mishra.mohak.templateDesignPattern;

public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game is over!");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game is ready!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game is ready!");
    }
}
