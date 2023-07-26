package com.in28minutes.learnspringframework.game;

import com.in28minutes.learnspringframework.GamingConsole;

public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) { //utilize the name of the interface
        this.game=game;
    }
    public void run(){
        System.out.println("Running game: " + game);
        game.up(); //all of these methods still work because they are apart of the
        //interface definition
        game.down();
        game.left();
        game.right();
    }
}
