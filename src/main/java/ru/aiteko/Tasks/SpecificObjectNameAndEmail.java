package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.*;

import java.math.BigDecimal;

public class SpecificObjectNameAndEmail implements Runnable{
    @Override
    public void run() {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        root.data.stream()
                .filter(object ->
                        CalculatingAge.CalculatingAgeFromBirthday(object.getBirthday()) > 30 &&
                        object.getStatus().equals(Status.ACTIVE) &&
                                (object.getEmails().get(0).endsWith("example.com") ||
                                        object.getEmails().get(1).endsWith("example.com")) &&
                        object.getMonthlySalary().compareTo(BigDecimal.valueOf(300)) < 0)
                .forEach(object -> System.out.println(object.name + " emails: " + object.getEmails()));
        System.out.println();
    }
}
