package academy.learnprogramming;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //lambda
//        new Thread(()-> {
//            System.out.println("printing from runnable lambda");
//            System.out.println("line 2");
//            System.out.format("this is line %d\n", 3);
//        }).start();

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buchalcka", 21);
        Employee jack = new Employee("Jack Hill", 40);
        Employee snow = new Employee("Snow White", 22);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee emp1, Employee emp2) {
//                return emp1.getName().compareTo(emp2.getName());
//            }
//        });
//        for(Employee employee: employees){
//            System.out.println(employee.getName());
//        }



    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}