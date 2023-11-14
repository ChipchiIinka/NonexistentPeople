package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.Root;

public class UniqueCompanyNames implements Runnable{
    @Override
    public void run() {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        System.out.println("Уникальные названия компаний: ");
        root.data.stream()
                .map(object -> object.job.getCompany())
                .distinct()
                .forEach(System.out::println);
    }
}
