package pl.jkanclerz.pp5;

import pl.jkanclerz.pp5.factory.Employee;
import pl.jkanclerz.pp5.factory.FactoryConfiguration;
import pl.jkanclerz.pp5.factory.Product;

public final class App {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Employee employee = FactoryConfiguration.getResponsibleEmployee();

        Product p1 = employee.doWork();
        Product p2 = employee.doWork();
        Product p3 = employee.doWork();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
