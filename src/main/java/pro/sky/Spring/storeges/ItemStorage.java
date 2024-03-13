package pro.sky.Spring.storeges;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@SessionScope
@Component
public class ItemStorage {
    private final Map<Long, Integer> countByItems = new HashMap<>();
    public void add(List<Long> ids) {
        for (Long id : ids) {
            if (countByItems.containsKey(id)) {
                countByItems.put(id, countByItems.get(id) + 1);
            } else {
                countByItems.put(id, 1);
            }
        }
    }


    public Map<Long, Integer> getAll() {
        return countByItems;
    }
}
