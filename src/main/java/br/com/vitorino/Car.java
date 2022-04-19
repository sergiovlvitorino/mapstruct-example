package br.com.vitorino;

import java.util.List;

public class Car {

    private String name;

    private List<Tire> tires;

    public String getName() {
        return name;
    }

    public List<Tire> getTires() {
        return tires;
    }

    public void setTires(List<Tire> tires) {
        this.tires = tires;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
