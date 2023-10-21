package ru.job4j.tracker;

import java.util.Arrays;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[items.length];
        int counter = 0;
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                rsl[counter] = items[i];
                counter++;
            }
        }
        return Arrays.copyOf(rsl, counter);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item updateItem) {
        int index = indexOf(id);
        if (index != -1) {
            updateItem.setId(id);
            items[index] = updateItem;
            return true;
        }
        return false;
    }

    public boolean delete(int id) {
        int distPos = indexOf(id);
        if (distPos == -1) {
            return false;
        }
        int startPos = distPos + 1;
        int length = size - distPos - 1;
        System.arraycopy(items, startPos, items, distPos, length);
        items[size - 1] = null;
        size--;
        return true;
    }

}