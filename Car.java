package com.htp;

public class Car {
    private String engine;
    private String kpp;
    private String wheels;
    private String kuzov;
    private String kopot;

    private String marka;
    private String model;
    private double priceCar = 500;
    private double priceKpp = 100;
    private double priceEngine = 200;
    private double priceWhiles = 50;
    private double priceKuzov = 150;
    private double priceKopot = 10;

    public Car(String engine, String kpp, String wheels, String kuzov, String kopot, double priceCar, double priceKpp, double priceEngine, double priceWhiles, double priceKuzov, double priceKopot) {
        this.engine = engine;
        this.kpp = kpp;
        this.wheels = wheels;
        this.kuzov = kuzov;
        this.kopot = kopot;
        this.priceCar = priceCar;
        this.priceKpp = priceKpp;
        this.priceEngine = priceEngine;
        this.priceWhiles = priceWhiles;
        this.priceKuzov = priceKuzov;
        this.priceKopot = priceKopot;
    }

    public Car(String marka, String model) {
        this.marka = marka;
        this.model = model;
    }

    public Car() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getKpp() {
        return kpp;
    }

    public void setKpp(String kpp) {
        this.kpp = kpp;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getKuzov() {
        return kuzov;
    }

    public void setKuzov(String kuzov) {
        this.kuzov = kuzov;
    }

    public String getKopot() {
        return kopot;
    }

    public void setKopot(String kopot) {
        this.kopot = kopot;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPriceCar() {
        return priceCar;
    }

    public void setPriceCar(double priceCar) {
        this.priceCar = priceCar;
    }

    public double getPriceKpp() {
        return priceKpp;
    }

    public void setPriceKpp(double priceKpp) {
        this.priceKpp = priceKpp;
    }

    public double getPriceEngine() {
        return priceEngine;
    }

    public void setPriceEngine(double priceEngine) {
        this.priceEngine = priceEngine;
    }

    public double getPriceWhiles() {
        return priceWhiles;
    }

    public void setPriceWhiles(double priceWhiles) {
        this.priceWhiles = priceWhiles;
    }

    public double getPriceKuzov() {
        return priceKuzov;
    }

    public void setPriceKuzov(double priceKuzov) {
        this.priceKuzov = priceKuzov;
    }

    public double getPriceKopot() {
        return priceKopot;
    }

    public void setPriceKopot(double priceKopot) {
        this.priceKopot = priceKopot;
    }

    public double sumPriceCar(){
        return priceCar + priceKpp + priceEngine + priceWhiles + priceKuzov + priceKopot;
    }
    public String getNameCar(){
        return this.marka+" "+this.model;
    }
}
