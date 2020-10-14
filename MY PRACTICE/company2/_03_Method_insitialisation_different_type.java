package com.company2;

public class _03_Method_insitialisation_different_type {
    int logic(int x ,int y){
        int z = x+y;
        return  z;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 10;
        _03_Method_insitialisation_different_type obj = new _03_Method_insitialisation_different_type();
        int c = obj.logic(a,b);

        System.out.println("The vaue of a and b after addition is "+c);
    }
}
