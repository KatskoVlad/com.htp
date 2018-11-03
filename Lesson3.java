package com.htp;

import java.sql.SQLOutput;

public class Lesson3 {
    //Code convension
    public int a = 10; // паблик доступен везде
    private String b = "string"; //только в классе
    protected int c = 2; // только у наследника
    int d = 9; // только внутри пакета
    boolean bool = false;
    public final int constants = 10;
    public static int A = 0;
    private String str = "abc";
    public static final int u =0;

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    //default constructor
    public Lesson3() {
    }

    // Another constructor - тут начинается перегрузка
    public Lesson3(int a, String b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Lesson3(int a, String b) {
        this.a = a;
        this.b = b;
    }
// Перегрузка
    //1.
    //2.
    //3.
    //

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
    // Структура метода:
    // модификатор доступа | public static

    public double calcOurVars(double first, double second, double third){
        return first + second + third;
    }
    public int calcOurVars(int first, int second, int third){
        return first + second + third;
    }

//    public int calcOurVars(int second, int first, double third){
//        return first + second + third;
//    }

    public static void main(String[] args) {
        Car car = new Car("Volvo", "XC90" );
        car.setKpp("Автомат");
        car.setKuzov("Дверь");
        double price = CalculatePriceCar.sumPriceCar(car.getPriceCar(),
                car.getPriceKpp(),
                car.getPriceEngine(),
                car.getPriceWhiles(),
                car.getPriceKuzov(),
                car.getPriceKopot());
//        car.setMarka("Volvo");
//        car.setModel("XC90");
        System.out.println("Авто: "+car.getNameCar()+" Цена: "+price+
                " Замененные детали - "+car.getKpp()+" " +car.getKuzov());
    }
}
