package com.example.demoMySpringBooot.controller;

import com.example.demoMySpringBooot.employee.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Scanner;

@RestController
public class DemoController {
    //Endpoint  @RequestMapping("/endpoint_name")
    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello to spring boot application");
    }
    @RequestMapping("/msg")
    public String message(){
        return "Welcome to Spring Boot";
    }
    @RequestMapping("/subt")
    public String Subtraction(){
        int a=545;
        int b=232;
        return "Subtraction of given number "+(a-b);
    }
    @RequestMapping("/multi")
    public String Multiplication(){
        int a=45;
        int b=22;
        return "Multiply  of given number "+(a*b);
    }
    @RequestMapping("/scanner")
    public String input(){
        Scanner obj=new Scanner(System.in);
        System.out.println("please enter the msg display in browser ");
        String msg=obj.nextLine();
        return msg;

    }
    @RequestMapping("/employee")
    public Employee createEmployee(){
        Employee employee=new Employee("Syed" , 123,52512);

        return employee;
    }

    @RequestMapping("/course")
    public ArrayList<String> getCourse(){
        ArrayList<String> course=new ArrayList<>();
        course.add("Java");
        course.add("math");
        course.add("Oracle");
        course.add("Java 8");
        return course;
    }
    @RequestMapping("/empl")
    public ArrayList<Employee> getEmployee(){
        ArrayList<Employee> employee =new ArrayList<>();
        Employee employee1=new Employee("Syed" , 123,52512);
        Employee employee2 =new Employee("Sharma" , 321,50000);
        Employee employee3=new Employee("Sohail" , 136,45000);
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        return employee;

    }

    //for check the even number
    @RequestMapping("/range")
    public String evenNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the range of number");
        int range=scanner.nextInt();

        String output="";
        for(int i=1; i<range;i++){
            if (i%2==0){
            output+=i+ "is even number";
            }
        }
        return output;
    }
}
