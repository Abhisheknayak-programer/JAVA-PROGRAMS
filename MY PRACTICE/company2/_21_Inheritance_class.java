package com.opps;

class Phone{
    int price;
    String name;

    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return  this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  this.name;
    }

    //constructor for phone
    Phone(){
        this.name = "Nokia";
        this.price = 40000;
    }
}

class SmartPhone extends  Phone{
    int id;

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return  this.id;
    }

    SmartPhone(){
        System.out.println("I am a default Smartphone With No Arguments");
        this.id = 69;
    }

    SmartPhone(String name){
        this.name = name;
        System.out.println("I am a Smartphone Inherited From the Phone Class and My Name is "+ name);
    }
}

public class _21_Inheritance_class {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());

        SmartPhone sp1 = new SmartPhone();
        System.out.println(sp1.getName());
        System.out.println(sp1.getPrice());
        System.out.println(sp1.getId());

        SmartPhone sp2 = new SmartPhone("Samsung");
        System.out.println(sp2.getName());
        System.out.println(sp2.getPrice());
        sp2.setName("Realme 6");
        sp2.setId(41);
        sp2.setPrice(17999);
        System.out.println("After Assigning the custom values : ");
        System.out.println(sp2.getId());
        System.out.println(sp2.getName());
        System.out.println(sp2.getPrice());
    }
}
