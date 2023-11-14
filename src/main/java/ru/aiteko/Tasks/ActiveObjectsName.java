package ru.aiteko.Tasks;
//1
import ru.aiteko.ObjectData.Datum;
import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.Root;
import ru.aiteko.ObjectData.Status;

public class ActiveObjectsName implements Runnable{
    @Override
    public void run() {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();
        System.out.println("Список Активыных Пользователей: ");
        root.data.stream()
                .filter(object -> object.getStatus().equals(Status.ACTIVE))
                .map(Datum::getName)
                .forEach(System.out::println);
    }
}
