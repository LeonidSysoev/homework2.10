package pro.sky.homework210.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.homework210.Item;
import pro.sky.homework210.repository.StoreRepository;

import java.util.Arrays;
import java.util.Collection;

@RestController
@RequestMapping("/order")

public class StoreController {
    private final StoreRepository storeRepository;

    public StoreController(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @GetMapping("/add")
    public void item(@RequestParam String itemName, @RequestParam Integer... ID) {
        storeRepository.addItem(itemName, ID.clone());
    }

    @GetMapping("/get")
    Collection<Item> get() {
        return storeRepository.getItems();
    }
}
