package Task1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Sasha", "Counter", 20000, LocalDate.of(2000, 12, 1));
        Employee employee2 = new Employee("Misha", "Manager", 20000, LocalDate.of(1980, 1, 2));
        Employee employee3 = new Employee("Vova", "Saler", 20000, LocalDate.of(1990, 8, 30));
        Employee employee4 = new Employee("Anton", "Saler", 20000, LocalDate.of(1994, 9, 17));
        Boss boss = new Boss("Pasha", "Boss", 50000, LocalDate.of(1970, 8, 6));

        int diff = (Employee.birthDateComparator().compare(employee3, employee4));
        if (diff<0) {
            System.out.println(employee4.name+" младше "+ employee3.name);
        } else System.out.println(employee3.name+" младше "+ employee4.name);

        employee1.increseSale(employee1, 10000);
        System.out.println(employee1.getSale());
        boss.increseSale(boss, 20000);
        System.out.println(boss.getSale());

    }
    
}