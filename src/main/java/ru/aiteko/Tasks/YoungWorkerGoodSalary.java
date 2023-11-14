package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.*;

import java.util.Comparator;

public class YoungWorkerGoodSalary implements Runnable{
    @Override
    public void run() {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        System.out.println("Пользователь младше 21 лет с самой большой зарплатой: ");
        root.data.stream()
                .filter(object -> CalculatingAge.CalculatingAgeFromBirthday(
                        object.getBirthday())<21 &&
                        object.getStatus().equals(Status.ACTIVE))
                .max(Comparator.comparing(Datum::getMonthlySalary))
                .map(Datum::getName)
                .ifPresent(System.out::println);
        System.out.println();
    }
}
