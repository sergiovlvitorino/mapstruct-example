package br.com.vitorino;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarMapperTest {

    @Test
    public void testIfCarMapperMapsCarRequestDTOToCar() {

        final CarRequestDTO requestDTO = new CarRequestDTO();
        requestDTO.setName("HRV");
        requestDTO.setTires(new ArrayList<TireRequestDTO>());
        requestDTO.getTires().add(new TireRequestDTO());
        requestDTO.getTires().get(0).setName("Firestone");

        final Car car = CarMapper.INSTANCE.requestDtoToModel(requestDTO);

        Assertions.assertEquals(requestDTO.getName(), car.getName());
        Assertions.assertEquals(requestDTO.getTires().get(0).getName(), car.getTires().get(0).getName());

    }
    
}
