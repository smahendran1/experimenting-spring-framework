package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {



    @Bean
    public GamingConsole game(){
        var game = new PacmanGame();
        return game;
    }
    @Bean
    public GameRunner gameRunner(){
        var gameRunner= new GameRunner(game());
        return gameRunner;
    }



}
