package Drow.ConsoleUI;

import Drow.IDrower;

import java.util.stream.IntStream;

public class ConsoleUI implements IDrower {

    public static void drowMenu(String[] names){
        System.out.println();
    }

    @Override
    public void DrowMenu(String[] lables, String title) {
        Integer maxLength = 0;
        for(String lable:lables){
            if (lable.length() > maxLength) {
                maxLength = lable.length();
            }
        }

        StringBuilder line = new StringBuilder();
        IntStream.range(0, maxLength + 7).mapToObj(i -> "-").forEach(line::append);

        System.out.println(line.toString());
        System.out.println("  " + title);
        System.out.println(line.toString());

        for (Integer i = 0; i < lables.length; i++){
            System.out.print("| ");
            System.out.print(i+1 + ". " + lables[i]);

            if (lables[i].length() < maxLength){
                for (Integer delta = maxLength - lables[i].length(); delta > 0; delta--){
                    System.out.print(" ");
                }
            }
            System.out.println(" |");
        }

        System.out.println(line.toString());
    }

    @Override
    public void DrowStat(String[] stats) {

    }

    @Override
    public void DrowBackground() {
        System.out.println("------------Next day------------");
    }
}
