import Drow.ConsoleUI.ConsoleUI;
import Drow.Parser;
import Game.Game;

import java.io.Console;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        while(game.Game){
            System.out.println("---------------------------JavaGameSurvival---------------------------");
            game.Start();

            System.out.println("Game Over. Your booser is dead. Score: " + game.Score);
            System.out.println("Thanks for the game.");
            System.out.println("Write \"R\" for restart.");

            Scanner write = new Scanner(System.in);
            if(!write.nextLine().equalsIgnoreCase("R")){
                game.Game = false;
            }
        }

    }
}