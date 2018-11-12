package com.htp.Zadanie;

import java.util.Objects;

public class Candies extends Sweets {
    private String nameCandies;
    private int weightCandies;

    public Candies() {
        super();
    }

    public Candies(String nameCandies, int weightCandies) {
        super(nameCandies, weightCandies);
        this.nameCandies = nameCandies;
        this.weightCandies = weightCandies;
    }

    public String getNameCandies() {
        return nameCandies;
    }

    public void setNameCandies(String nameCandies) {
        this.nameCandies = nameCandies;
    }

    public int getWeightCandies() {
        return weightCandies;
    }

    public void setWeightCandies(int weightCandies) {
        this.weightCandies = weightCandies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candies candies = (Candies) o;
        return weightCandies == candies.weightCandies &&
                Objects.equals(nameCandies, candies.nameCandies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCandies, weightCandies);
    }

    @Override
    public String toString() {
        return "Candies{" +
                "nameCandies='" + nameCandies + '\'' +
                ", weightCandies=" + weightCandies +
                '}';
    }
}
