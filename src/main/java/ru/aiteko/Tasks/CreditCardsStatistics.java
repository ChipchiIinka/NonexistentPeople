package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.Root;

import java.util.stream.Collectors;

public class CreditCardsStatistics implements Runnable{
    @Override
    public void run() {
        Root root = GsonParser.parse();
        assert root != null;

        System.out.println("Статистика пользования картами: ");
        root.data.stream()
                .map(object -> object.creditCard.getIssuer())
                .collect(Collectors.groupingBy(
                        issuer -> issuer,
                        Collectors.counting()
                        ))
                .forEach((issuer, count) ->
                        System.out.printf("Карт %s - %d\n",issuer, count));
        System.out.println();
    }
}
