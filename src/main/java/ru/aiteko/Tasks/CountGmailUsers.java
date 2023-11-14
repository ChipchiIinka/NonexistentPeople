package ru.aiteko.Tasks;

import ru.aiteko.GsonParserAndTypeAdapterLDT.GsonParser;
import ru.aiteko.ObjectData.Root;

public class CountGmailUsers implements Runnable{
    @Override
    public void run() {
        GsonParser parser = new GsonParser();
        Root root = parser.parse();

        long count = root.data.stream()
                .filter(object -> object.getEmails().get(0).endsWith("gmail.com") &&
                        object.getEmails().get(1).endsWith("gmail.com"))
                .count();
        System.out.printf("\nКоличество Пользователей пользующихся только gmail почтой: %d\n\n", count);
    }
}
