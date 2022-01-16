package com.demo;

public class Demo {
    int i = 10;
    int j = 20;
    int k = 30;

    public static void main(String[] args) {
        Demo d = new Demo();
        d.i = 110;
        d.j = 120;
        d.k = 130;
        System.out.println(d.i);
        d.i = 150;
        System.out.println(d.i);
        System.out.println(d.j);
        d.j = 160;
        System.out.println(d.j);
        System.out.println(d.k);
        d.k = 170;
        System.out.println(d.k);

        Demo Pratik = new Demo();
        Pratik.i = 210;
        Pratik.j = 220;
        Pratik.k = 230;
        System.out.println(Pratik.i);
        Pratik.i = 250;
        System.out.println(Pratik.i);
        System.out.println(Pratik.j);
        Pratik.j = 260;
        System.out.println(Pratik.j);
        System.out.println(Pratik.k);
        Pratik.k = 270;
        System.out.println(Pratik.k);

        Demo a = new Demo();
        a.i = 310;
        a.j = 320;
        a.k = 330;
        System.out.println(a.i);
        a.i = 350;
        System.out.println(a.i);
        System.out.println(a.j);
        a.j = 360;
        System.out.println(a.j);
        System.out.println(a.k);
        a.k = 370;
        System.out.println(a.k);
    }
}
