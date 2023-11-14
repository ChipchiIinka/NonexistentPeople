package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.Root;
import ru.aiteko.ObjectData.Status;

import java.util.Map;
import java.util.stream.Collectors;

public class StateDisableObjectStatistic implements Runnable{
    @Override
    public void run() {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        System.out.println("Статистика неактивных пользователей по штатам - топ 5: ");
        root.data.stream()
                .filter(object -> object.getStatus().equals(Status.DISABLED))
                .map(object -> object.location.getState())
                .collect(Collectors.groupingBy(
                        state -> state,
                        Collectors.counting()
                ))
                .entrySet().stream()//ключ-значения из Map
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())//по ключам в map, сортировка по знач. неактивных пользователей в штате, в убывающ порядке
                .limit(5)
                .forEach((entry) ->
                System.out.printf("%s - %d неактивных пользователей.\n",entry.getKey(), entry.getValue()));
        System.out.println();
    }
}

