package pro.sky.homework210;

import java.util.Objects;

public class Item {
    private final int ID;
    private final String itemName;

    public Item(int ID, String itemName) {
        this.ID = ID;
        this.itemName = itemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item items)) return false;
        return ID == items.ID && Objects.equals(itemName, items.itemName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, itemName);
    }

    @Override
    public String toString() {
        return "Item{" +
                "ID=" + ID +
                ", itemName='" + itemName + '\'' +
                '}';

    }

    public int getID() {
        return ID;
    }

    public String getItemName() {
        return itemName;
    }
}

