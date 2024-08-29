package Drow;

import Drow.ConsoleUI.ConsoleUI;

import java.util.ArrayList;

public class UIController {
    public String Page = "Base";
    String[] MenusList = new String[]{"Work", "Food", "Homes", "Base"};

    String[] Works;
    String[] Foods;
    String[] Homes;

    IDrower Drawer;


    public UIController(){
        Works = Parser.GetWorkList();
        Foods = Parser.GetFoodList();
        Homes = Parser.GetHomeList();

        Drawer = new ConsoleUI();
    }

    public void DrowWork(){
        ArrayList<String> Salarys = new ArrayList<String>();
        for(String workName:Parser.GetWorkList())
        {
            Salarys.add(workName + " " + Parser.GetWorkSalarys(workName)[1]);
        }
        Drawer.DrowMenu(Salarys.toArray(new String[0]), "Work");
    }

    public void DrowPage(String page){
        switch (page){
            case "Work":
                break;
            case "Food":
                break;
            case "Homes":
                break;
            case "Base":
                break;
        }
    }

}
