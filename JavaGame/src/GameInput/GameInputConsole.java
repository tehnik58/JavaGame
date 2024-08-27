package GameInput;

import java.util.Scanner;

public class GameInputConsole implements IGameInput{

    @Override
    public Integer GetPlayerInputOnMenu() {
        Scanner myObj = new Scanner(System.in);
        return Integer.valueOf(myObj.nextLine());
    }
}
