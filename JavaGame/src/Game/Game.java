package Game;

import Drow.Parser;
import Drow.UIController;
import GameInput.GameInputConsole;
import GameInput.IGameInput;

import java.util.Objects;

enum WeeksDay{
    Mo,
    Tu,
    We,
    Thu,
    Fr,
    Sa,
    Su,
    None
}

class Home{
    String ActualHome = "None";
    Integer PowerLessOnNight = 0;
    WeeksDay BuyDay = WeeksDay.None;

    public String ToString(){
     return "Home: " + ActualHome + ", Buy Day: " + ActualHome;
    }

    public Boolean IsBuyDay(WeeksDay day){
        return day == BuyDay;
    }

    public void SwitchHome(String name){
        PowerLessOnNight = Integer.valueOf(Objects.requireNonNull(Parser.GetHomeParanetrsList(ActualHome))[2]);
    }
}

public class Game {
    Drow.UIController UIController;
    IGameInput Input;

    Integer Score = 0;

    WeeksDay Day = WeeksDay.Mo;
    Booser player;

    public Game(){
        UIController = new UIController();
        Input = new GameInputConsole();
    }

    private void GameLoop(){
        while(player.IsLive){
            Day = WeeksDay.values()[(int) (player.Adge % 7.0)];

            UIController.DrowWork();

            player.LiveTest();
            player.Adge++;
            break;
        }
    }

    public void Start(){
        player = new Booser();
        GameLoop();
    }
}
