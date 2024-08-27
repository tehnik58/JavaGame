package Drow;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Parser {
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
            Works = new String[WorkList.size()];
            Works = WorkList.toArray(new String[0]);

            return Works;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
