package com.zq.template;

public class Dota extends Game {
    @Override
    void initialize() {
        System.out.println("dota initialize");
    }

    @Override
    void startPlay() {
        System.out.println("dota play");
    }

    @Override
    void endPlay() {
        System.out.println("dota end");
    }
}
