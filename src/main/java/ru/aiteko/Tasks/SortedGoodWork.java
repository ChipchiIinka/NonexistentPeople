package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.Root;

import java.math.BigDecimal;

public class SortedGoodWork implements Runnable{
    @Override
    public void run() {
        Root root = GsonParser.parse();
        assert root != null;

        System.out.println("Сортированный список профессий за которые платят больше 500: ");
        root.data.stream()
                .filter(object -> (object.getMonthlySalary().compareTo(BigDecimal.valueOf(500)) > 0))
                .map(object -> object.job.getTitle())
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}
