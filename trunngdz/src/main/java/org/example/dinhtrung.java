package org.example;

public class dinhtrung {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("diện tích hình chữ nhat " +(a*b));
        System.out.println("chu vi hình chữ nhật "+ ((a+b)*2));
        bai2();
        bai3();
        bai4();
        bai5();
    }

    public static void bai2() {
        int a1 = 10;
        double pi = 3.14;
        double cv =(double) a1*2*pi;
        double dt = (double) a1*a1*pi;
        System.out.println("chu vi hình tròn "+ cv);
        System.out.println(" diện tích hình tròn "+ dt);
    }

    public static void bai3() {
        int max = 4;
        for(int num : new int[] {4,5,6,7}){
            if(num > max){
                max = num;
            }
        }
        System.out.println("số lớn nhất là " + max);
    }

    public static void bai4() {
        double so = 40;
        double kq = Math.sqrt(so);
        kq = Math.round(kq * 1000.0)/1000.0;
        System.out.println("kết quả khi khai căn "+ kq);
    }

    public static void bai5() {
        int p = 20;
        int q = 30;
        double th = (double) p/q;
        th = Math.round(th*1000.0)/1000.0;
        System.out.println("thương của 2 số " + th);
    }
}
