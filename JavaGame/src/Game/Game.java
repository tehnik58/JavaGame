package Game;

public class Game {
    Integer Score = 0;
    Double Many = 0.0;

    Booser player;

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
