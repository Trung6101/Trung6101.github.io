package org.example;

public class bt {
    public static void main(String[] bai1) {
int i = 10;
int n = i++%5;
int i1 = 10;
int n1 = ++i1%5;
        System.out.println("in ra gia tri cuoi cùng i=" + i);
        System.out.println("n=" + n);
        System.out.println("i1=" + i1);
        System.out.println("n1=" + n1);
        bai2();
        bai3();

    }
    public static void bai2(){

        int f = 20;
        double c = (f - 32) / 1.8;
        System.out.println("c =" + c);

    }
    public static void bai3(){
          double d = (double) 9/5;

        System.out.println("d="+ d);
    }
}
