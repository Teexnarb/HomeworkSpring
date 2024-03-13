package pro.sky.Spring.services;

import org.springframework.stereotype.Service;
import pro.sky.Spring.storeges.ItemStorage;

import java.util.*;

@Service
public class ItemService {
    private final ItemStorage itemStorage;

    public ItemService(ItemStorage itemStorage) {
        this.itemStorage = itemStorage;
    }

    public void add(List<Long> ids) {
        itemStorage.add(ids);
    }


    public Map<Long, Integer> getAll() {
        return itemStorage.getAll();
    }
}
