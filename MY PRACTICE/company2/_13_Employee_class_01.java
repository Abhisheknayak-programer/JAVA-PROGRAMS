package com.company2;

class  Employee{
    int id;
    int salary;
    String name;
}

public class _13_Employee_class_01 {
    public static  void main(String[] args){
        Employee E1 = new Employee();

        E1.name = "Abhishek Nayak";
        E1.id = 401;
        E1.salary = 122333;

        System.out.println(E1.name);
        System.out.println(E1.id);
        System.out.println(E1.salary);
    }
}
