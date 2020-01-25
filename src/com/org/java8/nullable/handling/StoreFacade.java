package com.org.java8.nullable.handling;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StoreFacade {

    public static List<String> getAllItems(Inventory inventory) {
        List<String> names = new ArrayList<>();
        inventory.getItems().ifPresent(items -> items.stream().map(Item::getName).map(Optional::get).forEach(s -> names.add(s)));
        return names;
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Item item = new Item();
        item.name = "1";
        Item item2 = new Item();
        item2.name = "2";
        inventory.items = Arrays.asList(item, item2);
        List<String> result =  getAllItems(inventory);
        for(String s: result)
            System.out.println(s);

    }
}
