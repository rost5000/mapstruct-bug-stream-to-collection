package org.example;

import org.example.domain.SimpleModel;
import org.example.dto.SimpleModelResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.stream.Stream;

@Mapper
public interface SimpleMapper {
    @Mapping(target = "model")
    SimpleModelResponse toDto(Stream<SimpleModel> model);
}
