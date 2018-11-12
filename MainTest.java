package com.htp.Zadanie;

import java.util.ArrayList;

public class MainTest {
    public static void main(String[] args) {

//      Sweets chocolate = new Chocolate("Spartak", 100);
//      Sweets candies = new Candies("Komunarka", 200);
//        System.out.println(chocolate.toString());
//        System.out.println(chocolate.hashCode());
//        System.out.println(chocolate.equals(candies));
//
//        System.out.println(candies.toString());
//        System.out.println(candies.hashCode());
//        System.out.println(candies.equals(chocolate));

        ArrayList<Candies> listCandies = new ArrayList<Candies>();
        ArrayList<Chocolate> listChocolate = new ArrayList<Chocolate>();
        listCandies = MainTest.factoryCandies(5);
        listChocolate = MainTest.factoryChocalate(4);

        for (Chocolate chocolate : listChocolate) {
            System.out.println(chocolate.hashCode());
            System.out.println(chocolate.toString());
            System.out.println(chocolate.equals(listChocolate.get(2)));
        }
        for (Candies candies : listCandies) {
            System.out.println(candies.hashCode());
            System.out.println(candies.toString());
            System.out.println(candies.equals(listCandies.get(2)));
        }
    }
    public static ArrayList<Candies> factoryCandies(int count){
        ArrayList<Candies> list = new ArrayList<Candies>();
        for (int i = 0; i <count ; i++) {
            list.add(new Candies("Spartak", 100));
        }
        return list;
    }
    public static ArrayList<Chocolate> factoryChocalate(int count){
        ArrayList<Chocolate> list = new ArrayList<Chocolate>();
        for (int i = 0; i <count ; i++) {
            list.add(new Chocolate("Komunarka", 200));
        }
        return list;
    }
}
