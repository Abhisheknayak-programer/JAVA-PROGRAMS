package com.IMPORTANT;

class monKey{
    void Jump(){
        System.out.println("<>Jumping<>");
    }
    void bite(){
        System.out.println("<<<<I WILL BITE YOU>>>>");
        System.out.println("RUN \n Lol \n bhag gaya fatu sala");
    }
}

interface  BasicHuman{
    void Eat();
    void Sleep();
    void Speak();
}

interface HacKer{
    void Hacking();
    default  void Profession(String Name){
        System.out.println("Hello I am "+ Name + " And My Work Is Hacking The World For Good Work");
    }
}

interface  COder {
    void LineOfCode();
    default  void WorkProfession(String Name){
        System.out.println("Hello I am " + Name + " And My Work Is Only Coding Coding and Coding");
    }
}

class huMan extends  monKey implements  BasicHuman{
    public void Eat(){
        System.out.println("I am going for my lunch");
    }
    public void Sleep(){
        System.out.println("I am Going To sleep \n Good Night and Do not disturb me after my sleep ok");
    }
    public void Speak(){
        System.out.println("Aur Kya Bolti Hai Public");
    }
}

class  AbhiShek extends  huMan implements HacKer,COder{
    public  int lines;
    AbhiShek(int lines){
        this.lines = lines;
    }
    public void LineOfCode(){
        System.out.println("Today i have coded around "+ this.lines + " Lines of code");
    }
    public void Hacking() {
        System.out.println("Hacking Started Sir");
    }
}



public class _33_Practice_ques_2 {
    public  static void main(String[] args){
        monKey m = new monKey();
        m.bite();
        m.Jump();
        System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>");

        huMan h = new huMan();
        h.Sleep();
        h.Eat();
        h.bite();
        h.Jump();
        h.Speak();

        System.out.println("<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>");
        AbhiShek a = new AbhiShek(450);
        a.bite();
        a.Jump();
        a.Sleep();
        a.Speak();
        a.Eat();
        a.Hacking();
        a.Profession("Abhishek Nayak");
        a.LineOfCode();
        a.WorkProfession("Abhishek Nayak");

    }
}
