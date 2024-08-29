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
    private String ActualHome = "None";
    private Integer PowerLessOnNight = 0;
    private WeeksDay BuyDay = WeeksDay.None;

    public String ToString(){
        return "Home: " + ActualHome + ", Buy Day: " + ActualHome;
    }

    public Boolean IsBuyDay(WeeksDay day){
        return day == BuyDay;
    }

    public void SwitchHome(String name, WeeksDay day){
        PowerLessOnNight = Integer.valueOf(Objects.requireNonNull(Parser.GetHomeParanetrsList(ActualHome))[2]);
        ActualHome = name;
        BuyDay = day;
    }
}

public class Game {
    public Boolean Game;

    private Drow.UIController UIController;
    private IGameInput Input;

    public Integer Score = 0;

    private WeeksDay Day = WeeksDay.Mo;
    private Booser Player;
    private Home Home;

    public Game(){
        UIController = new UIController();
        Input = new GameInputConsole();
        Game = true;
    }

    private void GameLoop(){
        while(Player.IsLive){
            Player.Adge++;
            Day = WeeksDay.values()[(int) (Player.Adge % 7.0)];

            UIController.DrowWork();

            Player.LiveTest();
            break;
        }
    }

    public void Start(){
        Player = new Booser();
        GameLoop();
    }
}
