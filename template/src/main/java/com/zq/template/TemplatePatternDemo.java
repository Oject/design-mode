package com.zq.template;

public class TemplatePatternDemo {


    public static void main(String[] args) {

        Game game = new Basketball();
        game.play();
        System.out.println();
        game = new Dota();
        game.play();
    }
}
