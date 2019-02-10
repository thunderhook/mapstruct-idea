/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.complex;

import java.util.List;
import org.example.dto.Car;
import org.example.dto.CarDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {

    @Mapping(source = "<caret>empty", target = "available")
    CarDto map(List<Car> source);
}
