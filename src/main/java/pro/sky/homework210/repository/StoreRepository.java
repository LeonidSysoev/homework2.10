package pro.sky.homework210.repository;


import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.homework210.Item;

import java.util.*;


@SessionScope
@Service
public class StoreRepository implements StoreService {
    private final Set<Item> items;

    public StoreRepository(Set<Item> items) {
        this.items = new HashSet<>();
    }

    @Override
    public void addItem(String itemName, Integer... ID) {
        String[] itemNameParsed = itemName.split(",");
        if (itemNameParsed.length != ID.length) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < ID.length; i++) {
            int id = ID[i];
            String itemNameTemp = itemNameParsed[i];
            Item item = new Item(id, itemNameTemp);
            items.add(item);
        }


    }

    @Override
    public Collection<Item> getItems() {
        return Collections.unmodifiableCollection(items);
    }
}
