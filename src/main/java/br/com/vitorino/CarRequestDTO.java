package br.com.vitorino;

import java.util.List;

public class CarRequestDTO {

    private String name;

    private List<TireRequestDTO> tires;

    public String getName() {
        return name;
    }

    public List<TireRequestDTO> getTires() {
        return tires;
    }

    public void setTires(List<TireRequestDTO> tires) {
        this.tires = tires;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
