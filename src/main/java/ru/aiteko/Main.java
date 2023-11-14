package ru.aiteko;


import ru.aiteko.Tasks.*;
import ru.aiteko.Tasks.Runnable;

import java.util.stream.Stream;

public class Main
{
    public static void main(String[] args) {
        Stream.of(new ActiveObjectsName(), new CountGmailUsers(),
                new CreditCardsStatistics(), new SortedGoodWork(),
                new SpecificObjectNameAndEmail(),new StateDisableObjectStatistic(),
                new YoungWorkerGoodSalary(), new UniqueCompanyNames()
                ).forEach(Runnable::run);
    }
}
