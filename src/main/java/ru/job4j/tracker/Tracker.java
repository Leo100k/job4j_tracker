package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("checkstyle:EmptyLineSeparator")
public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        size++;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return items;
    }

    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (items.get(i).getName().equals(key)) {
                rsl.add(items.get(i));
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item updateItem) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            updateItem.setId(id);
            items.set(index, updateItem);
        }
        return rsl;
    }

    public boolean delete(int id) {
        int distPos = indexOf(id);
        boolean rsl = distPos != -1;
        if (rsl) {
            items.remove(distPos);
            size--;
        }
        return rsl;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
}