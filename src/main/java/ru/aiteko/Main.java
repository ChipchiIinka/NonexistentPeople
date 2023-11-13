package ru.aiteko;

import ru.aiteko.ObjectData.Datum;
import ru.aiteko.ObjectData.GsonParser;
import ru.aiteko.ObjectData.Root;
import ru.aiteko.ObjectData.Status;

public class Main
{
    public static void main(String[] args) {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();
        root.data.stream()
                .filter(person -> person.getStatus().equals(Status.ACTIVE))
                .map(Datum::getName)
                .forEach(System.out::println);
    }


}
