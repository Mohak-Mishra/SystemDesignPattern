package com.mishra.mohak.templateDesignPattern;

public class Football extends Game{

    @Override
    void endPlay() {
        System.out.println("Football game is over!");
    }

    @Override
    void startPlay() {
        System.out.println("Football game is started!");
    }

    @Override
    void initialize() {
        System.out.println("Football game is ready!");
    }
}
