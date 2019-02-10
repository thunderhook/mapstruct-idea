/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.complex;

import org.example.dto.Garage;
import org.example.dto.GarageDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CarMapper {

    @Mapping(source = "car.unknown.<caret>person")
    GarageDto map(Garage garage);
}
