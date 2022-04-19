package br.com.vitotorino;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TireMapper {

    TireMapper INSTANCE = Mappers.getMapper(TireMapper.class);

    @Mapping(source = "name", target = "name")
    Tire requestDTOToModel(TireRequestDTO tireRequestDTO);

}
