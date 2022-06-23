package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        Employee emp1 = new Employee(100, "Serhii", "Kyrylenko", 6000);
        Employee emp2 = new Employee(51, "Petro", "Ivanov", 1000);
        Employee emp3 = new Employee(123, "Victor", "Fedko", 2000);
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        System.out.println("Before sorting \n" + emp);
        System.out.println(Collections.sort(emp,Comparable<>));

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}

