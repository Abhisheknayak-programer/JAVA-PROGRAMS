package com.company2;

class  Emp{
    String name;
    int id;
    int salary;


    public int getSalary(){
        return  salary;
    }

    public  int getid(){
        return  id;
    }

    public String getName(){
        return name;
    }


   public void SetName(String n){
        name = n;
   }

    public void Setsalary(int sal){
        salary = sal;
    }

    public void Setid(int New_id){
        id = New_id;
    }
}


public class _14_Employee_class_02 {
    public static void main(String[] args) {
        Emp e1 = new Emp();

        e1.SetName("Abhishek Bhai!!!");
        e1.Setid(401);
        e1.Setsalary(1223333);

        System.out.println(e1.getid());
        System.out.println(e1.getName());
        System.out.println("Bro Your annual income per year is : " +e1.getSalary());
    }
}
