package com.opps;

class circle{
    public  int radius;

    circle(int radius){
        this.radius = radius;
        System.out.println("I am a Circle Class Parametrized constructor "+ this.radius);
    }

    public int getRadius(){
        return  this.radius;
    }
    public  void setRadius(int radius){
        this.radius = radius;
    }

    public double area(){
        return  Math.PI * (this.radius * this.radius);
    }

}


class MyCylinder extends  circle{
    public  int height;

    MyCylinder(int radius,int height){
        super(radius);
        this.height = height;
        System.out.println("I am a Mycylinder class parametrized constructor " + this.height);
    }

    public double Volume(){
        return  Math.PI*(this.radius * this.radius) * this.height;
    }

}





public class _27_Inheritance_question1 {
    public static void main(String[] args){
        MyCylinder Mc1 = new MyCylinder(12,34);
        System.out.println(Mc1.Volume());
    }
}
