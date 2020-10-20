package com.company2;

class Square_Figure{
    int Size;

    public void area (){
        System.out.println(Size*Size);
    }
    public void Perimeter(){
        System.out.println(4*Size);
    }
    public void SetSize(int n){
        Size = n;
    }
}


class Rectangle_Figure{
    int Length;
    int Breadth;

    public void area (){
        System.out.println(Length*Breadth);
    }
    public void Perimeter(){
        int p = 2 * (Length + Breadth);
        System.out.println(p);
    }
    public void SetRec(int len,int bre){
        Length = len;
        Breadth = bre;
    }
}


class Circle_Figure{
    int Radius;

    public void  SetCircle(int r){
        Radius = r;
    }

    public void area(){
        double a = Math.PI * Math.pow(Radius,2);
        System.out.println(a);
    }

    public void perimeter(){
        double p =2 * (Math.PI * Radius);
        System.out.println(p);
    }

}


public class _16_Square_rectangle_circle_class_01 {
    public static void main(String[] args) {
        Square_Figure s1 = new Square_Figure();
        Rectangle_Figure r1 = new Rectangle_Figure();
        Circle_Figure c1 = new Circle_Figure();


        // Calculations for the square
        s1.SetSize(4);
        s1.area();
        s1.Perimeter();


        // Calculations for the rectangle
        r1.SetRec(10,10);
        r1.Perimeter();
        r1.area();

        //Calculations for circle
        c1.SetCircle(5);
        c1.area();
        c1.perimeter();
    }
}
