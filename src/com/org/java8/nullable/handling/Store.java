package com.org.java8.nullable.handling;

import java.util.List;
import java.util.Optional;

/*
            Store - has outlets -> outlets ->
            - each outlet has an -> inventory ->
            - inventory has -> items ->
            - each item has a name.
 */
public class Store {
    String name;
    List<Outlet> outlets;

    public Optional<List<Outlet>> getOutlets() {
        return Optional.ofNullable(outlets);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

class Outlet {
    String name;
    Inventory inventory;

    public Optional<Inventory> getInventory() {
        return Optional.ofNullable(inventory);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

class Inventory {
    String name;
    List<Item> items;

    public Optional<List<Item>> getItems() {
        return Optional.ofNullable(items);
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}

class Item {
    String name;

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}


