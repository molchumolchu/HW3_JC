package Task1;

import java.time.LocalDate;

public class Boss extends Employee {
    
    public Boss (String name, String post, int sale, LocalDate data1) {
        super(name, post, sale, data1);
    }

    @Override
    public int increseSale(Employee employee, int n) {
        n=0;
        return super.increseSale(employee, n);
    }

    

    
}
