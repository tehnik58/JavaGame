package Game;

import Drow.Parser;

enum WeeksDay{
    Mo,
    Tu,
    We,
    Thu,
    Fr,
    Sa,
    Su
}

public class Game {
    String[] Works;
    String[] Foods;
    String[] Homes;

    WeeksDay Day = WeeksDay.Mo;


    Integer Score = 0;
    Double Many = 0.0;
    String ActualHome = "None";

    Booser player;

    public Game(){
        Works = Parser.GetWorkList();
        Foods = Parser.GetFoodList();
        Homes = Parser.GetHomeList();
    }

    private void GameLoop(){
        while(player.IsLive){
            break;
        }
    }

    public void Start(){
        player = new Booser();
        GameLoop();
    }
}
