package pro.sky.homework210.repository;

import pro.sky.homework210.Item;

import java.util.Collection;

public interface StoreService {

    void addItem(String itemName, Integer... ID);

    Collection<Item> getItems();
}
