package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.*;

import java.math.BigDecimal;

public class SpecificObjectNameAndEmail implements Runnable{
    @Override
    public void run() {
        Root root = GsonParser.parse();
        assert root != null;

        System.out.println("Особые пользователи с характеристиками: Активный, старше 30 лет, зарплата меньше 100" +
                " и есть почта example.com");
        root.data.stream()
                .filter(object -> CalculatingAge.CalculatingAgeFromBirthday(object.getBirthday()) > 30 &&
                        object.getStatus().equals(Status.ACTIVE) &&
                        object.getEmails().stream().anyMatch(email -> email.endsWith("example.com")) &&
                        object.getMonthlySalary().compareTo(BigDecimal.valueOf(100)) < 0)
                .forEach(object -> System.out.println(object.name + " emails: " + object.getEmails()));
        System.out.println();
    }
}
