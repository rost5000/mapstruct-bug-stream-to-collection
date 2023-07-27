package org.example;

import org.example.domain.SimpleModel;
import org.example.dto.SimpleModelResponse;
import org.example.dto.SimpleModelResponse1;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.stream.Stream;

@SuppressWarnings("unused")
@Mapper
public interface SimpleMapper {
    /**
     * This method will be not compiled
     */
    @Mapping(target = "model")
    SimpleModelResponse toDto(Stream<SimpleModel> model);

    /**
     * This method will be compiled
     */
    @Mapping(target = "model")
    SimpleModelResponse1 toDto(SimpleModel model);
}
