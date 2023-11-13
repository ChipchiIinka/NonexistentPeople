package ru.aiteko.ObjectData;

import com.google.gson.Gson;
import java.io.FileReader;

public class GsonParser {
    public Root parse(){
        Gson gson = new Gson();
        try(FileReader reader = new FileReader("src\\main\\resources\\data.json")) {
            return gson.fromJson(reader,Root.class);
        } catch (Exception e){
            System.out.println("Parsing Error " + e.toString());
        }
        return null;
    }
}
