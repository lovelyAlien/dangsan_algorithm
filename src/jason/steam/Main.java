package jason.steam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();

        employees.add(new Employee("프랭크", 20, 400));
        employees.add(new Employee("포터", 20, 400));
        employees.add(new Employee("제이콥", 20, 400));
        employees.add(new Employee("제이슨", 20, 350));

        //salary가 400이상 평균
        //stream 사용 X
        int sum=0;
        int cnt=0;
        for(int i=0;i< employees.size();i++){
            if(employees.get(i).getSalary()>=400){
                sum+=employees.get(i).getSalary();
                cnt+=1;
            }
        }
        double average= sum/cnt;

        System.out.println(average);

        //steam 사용 O
        average= employees.stream()
                .filter(emp->emp.getSalary() >= 400)
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println(average);






    }



}
