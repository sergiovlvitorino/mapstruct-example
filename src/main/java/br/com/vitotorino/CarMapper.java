package br.com.vitotorino;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = { TireMapper.class })
public interface CarMapper {

    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    @Mapping(source = "name", target = "name")
    @Mapping(source = "tires", target = "tires")
    Car requestDtoToModel(CarRequestDTO carRequestDTO);

    
}
