package com.zq.template;

public class Basketball extends Game {
    @Override
    void initialize() {
        System.out.println("ball initialize");
    }

    @Override
    void startPlay() {
        System.out.println("ball start");
    }

    @Override
    void endPlay() {
        System.out.println("ball end");
    }
}
