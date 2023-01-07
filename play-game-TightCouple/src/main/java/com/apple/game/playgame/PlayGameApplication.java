package com.apple.game.playgame;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.apple.game.playgame.implement.GameRunner;
import com.apple.game.playgame.implement.MarioGame;
import com.apple.game.playgame.implement.PacManGame;
import com.apple.game.playgame.implement.SuperContraGame;

@SpringBootApplication
public class PlayGameApplication {

	public static void main(String[] args) {
		//SpringApplication.run(PlayGameApplication.class, args);
		
		//MarioGame game = new MarioGame();
		
		//SuperContraGame game = new SuperContraGame();
		
		PacManGame game = new PacManGame();
		
		GameRunner runner = new GameRunner(game);
		runner.runGame();
	}

}
