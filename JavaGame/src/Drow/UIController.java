package Drow;

import Drow.ConsoleUI.ConsoleUI;

public class UIDrowerController {
    String Page = "Base";
    String[] MenusList = new String[]{"Work", "Food", "Homes", "Base"};

    String[] Works;
    String[] Foods;
    String[] Homes;

    IDrower drower;

    public UIDrowerController(){
        Works = Parser.GetWorkList();
        Foods = Parser.GetFoodList();
        Homes = Parser.GetHomeList();

        drower = new ConsoleUI();
    }


}
