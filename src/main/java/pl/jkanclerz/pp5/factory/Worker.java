package pl.jkanclerz.pp5.factory;

import java.util.UUID;

class Worker {
    private final String name;

    Worker(String name, int capacity, boolean vip) {
        this.name = name;
    }

    public Product doWork() {
        return new Product(UUID.randomUUID());
    }
}
