/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
import org.mapstruct.Mapper;

@Mapper( componentModel = "c<caret>" )
public interface MyMapper {
}
