package Drow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {

    public static String[] GetHomeParanetrsList(String name){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/Home.txt"));
            String line = reader.readLine();

            while (line != null) {
                if(line.split(" ")[0].equals(name))
                {
                    reader.close();
                    return line.split(" ");
                }
                line = reader.readLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String[] GetHomeList(){
        ArrayList<String> homeList = new ArrayList<String>();
        String[] home;

        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/Home.txt"));
            String line = reader.readLine();

            while (line != null) {
                homeList.add(line.split(" ")[0]);
                line = reader.readLine();
            }
            reader.close();
            home = homeList.toArray(new String[0]);
            return home;
        }catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String[] GetFoodParanetrsList(String name){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/Food.txt"));
            String line = reader.readLine();

            while (line != null) {
                if(line.split(" ")[0].equals(name))
                {
                    reader.close();
                    return line.split(" ");
                }
                line = reader.readLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String[] GetFoodList(){
        ArrayList<String> foodList = new ArrayList<String>();
        String[] food;

        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/Food.txt"));
            String line = reader.readLine();

            while (line != null) {
                foodList.add(line.split(" ")[0]);
                line = reader.readLine();
            }
            reader.close();

            food = new String[foodList.size()];
            food = foodList.toArray(new String[0]);

            return food;
        }catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String[] GetWorkList(){
        ArrayList<String> WorkList = new ArrayList<String>();
        String[] Works;

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/Work.txt"));
            String line = reader.readLine();
            while (line != null) {
                WorkList.add(line.split(" ")[0]);
                line = reader.readLine();
            }
            reader.close();
            Works = WorkList.toArray(new String[0]);

            return Works;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String[] GetWorkSalarys(String Name){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/Work.txt"));
            String line = reader.readLine();

            while (line != null) {
                String[] ArrayLine = line.split(", ");
                if (ArrayLine[0].split(" ")[0].equals(Name))
                {
                    return new String[]{ArrayLine[0].split(" ")[0], ArrayLine[0].split(" ")[1]};
                }
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

        return new String[]{"null", "null"};
    }

    //0 index - Сondition Name
    //1 index - Сondition Score
    public static String[] GetWorkСondition(String Name){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/Work.txt"));
            String line = reader.readLine();

            while (line != null) {
                String[] ArrayLine = line.split(", ");
                if (ArrayLine.length > 1 && ArrayLine[0].split(" ")[0].equals(Name))
                {
                 return new String[]{ArrayLine[1].split(" ")[0], ArrayLine[1].split(" ")[1]};
                }
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e) {
            e.printStackTrace();
        }

        return new String[]{"null", "null"};
    }
}
