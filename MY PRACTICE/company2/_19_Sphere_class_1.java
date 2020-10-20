package com.opps;

class Sphere{
    private int radius;

    public Sphere(){
        this.radius = 2;
    }

    public Sphere(int radius) {
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}


public class _19_Sphere_class_1 {
    public static void main(String[] args) {
        Sphere S = new Sphere();

        double area = 4 * Math.PI *  Math.pow(S.getRadius(),2);
        System.out.println(area);
    }
}
