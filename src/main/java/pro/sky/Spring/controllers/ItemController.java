package pro.sky.Spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Spring.services.ItemService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/store/order")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    @GetMapping("/add")
    public void addItems(@RequestParam List<Long> ids) {
        itemService.add(ids);
    }

    @GetMapping("/get")
    public Map<Long, Integer> getItems() {
        return itemService.getAll();
    }
}
