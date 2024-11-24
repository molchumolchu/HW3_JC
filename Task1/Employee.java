package Task1;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Employee {
    public String name;
    public String post;
    public int sale;
    public LocalDate data1;

    public Employee(String name, String post, int sale, LocalDate data1) {
        this.name = name;
        this.post = post;
        this.sale = sale;
        this.data1 = data1;
    }

    // Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, 
    // представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
    
    public static Comparator<Employee> birthDateComparator() {
        return Comparator.comparing(employee -> employee.data1);
    }

    // Опишите класс руководителя, наследник от сотрудника. 
    // Перенесите статический метод повышения зарплаты в класс руководителя, 
    // модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей. 
    // В основной программе создайте руководителя и поместите его в общий массив сотрудников. 
    // Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

    public int increseSale(Employee employee, int n){
        employee.setSale(employee.getSale()+n);
        return employee.getSale();
    }
       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public LocalDate getData1() {
        return data1;
    }

    public void setData1(LocalDate data1) {
        this.data1 = data1;
    }



    
}
