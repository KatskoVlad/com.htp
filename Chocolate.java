package com.htp.Zadanie;

import java.util.Objects;

public class Chocolate extends Sweets {
    private String nameChocolate;
    private int weightChocolate;

    public Chocolate() {
        super();
    }

    public Chocolate(String nameChocolate, int weightChocolate) {
        super(nameChocolate, weightChocolate);
        this.nameChocolate = nameChocolate;
        this.weightChocolate = weightChocolate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chocolate chocolate = (Chocolate) o;
        return weightChocolate == chocolate.weightChocolate &&
                Objects.equals(nameChocolate, chocolate.nameChocolate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameChocolate, weightChocolate);
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "nameChocolate='" + nameChocolate + '\'' +
                ", weightChocolate=" + weightChocolate +
                '}';
    }

}
