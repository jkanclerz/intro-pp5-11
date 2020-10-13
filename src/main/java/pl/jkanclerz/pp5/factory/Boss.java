package pl.jkanclerz.pp5.factory;

import java.util.Collection;
import java.util.List;

class Boss implements Employee {
    private final List<Worker> workers;

    Boss(List<Worker> workers) {
        this.workers = workers;
    }

    @Override
    public Product doWork() {
        return  workers.stream().findFirst()
                .get()
                .doWork();
    }
}
