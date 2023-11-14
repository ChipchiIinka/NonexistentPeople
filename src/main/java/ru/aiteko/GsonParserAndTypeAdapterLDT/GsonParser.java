package ru.aiteko.GsonParserAndTypeAdapterLDT;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.aiteko.ObjectData.Root;

import java.io.FileReader;
import java.time.LocalDateTime;

public class GsonParser {
    public Root parse(){
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeAdapter())
                .create();
        try(FileReader reader = new FileReader("src\\main\\resources\\data.json")) {
            return gson.fromJson(reader,Root.class);
        } catch (Exception e){
            System.out.println("Parsing Error " + e);
        }
        return null;
    }
}
