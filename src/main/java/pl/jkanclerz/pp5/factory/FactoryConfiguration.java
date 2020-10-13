package pl.jkanclerz.pp5.factory;

import java.util.Collections;

public final class FactoryConfiguration {
    public static Employee getResponsibleEmployee() {
        return new Boss(
                Collections.singletonList(new Worker("bob", 10, false)));
    }
}
