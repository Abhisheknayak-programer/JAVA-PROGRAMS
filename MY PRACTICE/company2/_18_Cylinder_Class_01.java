package com.opps;

class Cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

}

public class _18_Cylinder_Class_01 {
    public static  void main(String[] args){
        Cylinder c1 = new Cylinder();
        c1.setHeight(12);
        c1.setRadius(10);

//        System.out.println(c1.getHeight());
//        System.out.println(c1.getRadius());

        double area =2 * 3.142 *c1.getRadius()*c1.getHeight()  + 2 * 3.142 *Math.pow(c1.getRadius(),2);
        System.out.println(area);
    }

}
