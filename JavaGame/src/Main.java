import Drow.Parser;
import Game.Game;

import java.io.Console;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        System.out.println(Parser.GetWorkList()[2]);
        game.Start();
    }
}