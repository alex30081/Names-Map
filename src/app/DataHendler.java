package app;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class DataHendler {

    Map<Integer, String> map = new DataRepository().getData();

    public String getAll() {
        StringBuilder sb = new StringBuilder();
        AtomicInteger count = new AtomicInteger(0);
        map.forEach((id, name) ->
                sb.append(String.format("%d) %d, %s%n",
                        count.incrementAndGet(), id, name)
                ));
        return "ALL NAMES:" + "\n" + sb;
    }

    public String getById(int id) {
        if (map.containsKey(id)) {
            return "NAME: id " + id + ", " +
                    map.get(id).toString();
        } else return "No data!";
    }
}
