package jason.steam;

import lombok.Getter;
import lombok.Setter;

public class Employee {

    private String name;
    private int age;
    private int salary;

    public Employee(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }

    public int getSalary() {
        return salary;
    }
}
